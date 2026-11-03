@echo off
setlocal
cd /d "%~dp0"

echo ================================================
echo SogGTAddon GTM 7.5.2 - DeepSpace GitHub sync
echo ================================================

where git >nul 2>&1
if errorlevel 1 (
  echo ERROR: Git was not found in PATH.
  exit /b 1
)

git switch main
if errorlevel 1 exit /b 1

git add -A
if errorlevel 1 exit /b 1

rem These local compile-only dependencies are required by build.gradle.
git add -f "libs\modularui-mc1.20.1-3.3.1-SNAPSHOT.jar" "libs\configuration-1.20.1-3.1.0-forge.jar"
if errorlevel 1 exit /b 1

git diff --cached --quiet
if errorlevel 1 (
  git commit -m "Sync SogGTAddon GTM 7.5.2 Sky of Grind DeepSpace changes"
  if errorlevel 1 exit /b 1
) else (
  echo No local changes to commit.
)

git push -u deepspace main
if errorlevel 1 (
  echo ERROR: Push failed. Local commits are preserved and can be pushed again.
  exit /b 1
)

echo.
echo Successfully synced to https://github.com/evilcatshb/soggtaddon-update-to-gtm-7.5.2-deepspace-fork
exit /b 0
