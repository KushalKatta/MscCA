::: Author - Akash Arora
::: MSc(CA) 2017-19
::: 17030142001
@echo off

::: LOG FILE PATH - Current Logged In User's Desktop
set logPath=%USERPROFILE%\Desktop\mylog.log

::: Taking Program Name from User (Case Sensitive)
set /p searchApp=Enter Program To Look for :

::: Custom While Loop - While not present in  Batch Script Achieved through Goto
::: This will take the Verbose Level and the user will be prompted until the Normal/Verbose is typed correctly (Case-Sensitive)
:while
	echo.
	echo Enter Verbose Level
	echo 1. Normal
	echo 2. Verbose
	set /p verboseLevel=Enter Choice :
	::: joining if statements since OR operator is not present
	if not %verboseLevel%==Normal if not %verboseLevel%==Verbose echo. && echo Invalid Choice... Retry && goto :while

::: LOG FILE FORMAT PREFIX
set logPrefix= : %verboseLevel% :

echo [%DATE% %TIME%] %logPrefix% START LOG	 > %logPath%
echo -------------------------- >> %logPath%
echo Starting Script
echo.
echo Running Set Command
echo [%DATE% %TIME%] %logPrefix% Running Set Command >> %logPath%

echo --------------------------
echo -------------------------- >> %logPath%
set
if %verboseLevel%==Verbose echo [%DATE% %TIME%] %logPrefix% Before Adding myName >> %logPath% && echo. >> %logPath% && set >> %logPath%
echo --------------------------
echo -------------------------- >> %logPath%

echo Setting myName = Akash
echo [%DATE% %TIME%] %logPrefix% Setting myName = Akash >> %logPath%
set myName=Akash

echo --------------------------
echo Running Set Command
echo [%DATE% %TIME%] %logPrefix% Running Set Command >> %logPath%
echo --------------------------
echo -------------------------- >> %logPath%
set
::: Checking for Verbositiy Level and Writing to log file
if %verboseLevel%==Verbose echo [%DATE% %TIME%] %logPrefix% After Adding myName >> %logPath% && echo. >> %logPath% && set >> %logPath%
echo --------------------------
echo -------------------------- >> %logPath%

::: variables for looking for the software
set counter=0
set foundWinRAR=false

echo [%DATE% %TIME%] %logPrefix% Looking for Software %searchApp% >> %logPath%
echo -------------------------- >> %logPath%

::: Searching Begins in ProgramFiles
echo Searching In ProgramFiles
echo [%DATE% %TIME%] %logPrefix% Searching In ProgramFiles  >> %logPath%
echo -------------------------- >> %logPath%

::: Changing Directory
cd /d %ProgramFiles%

echo **************************

::: Checking the name of each Directory
for /d  %%i in (*) do (
	if %verboseLevel%==Verbose echo [%DATE% %TIME%] %logPrefix% Checking Directory Name = %%i >> %logPath%
	if %%i==%searchApp% (
		set counter=%counter%+1
		if %%i==WinRAR set foundWinRAR=true
		echo %searchApp% Found
		echo [%DATE% %TIME%] %logPrefix% %searchApp% FOUND >> %logPath%
		)
)
echo -------------------------- >> %logPath%

if %foundWinRAR%==true echo WinRAR was Found... UnInstalling Now. && echo [%DATE% %TIME%] %logPrefix% WinRAR Found .. Changing Directory and UnInstalling >> %logPath% && cd WinRAR && uninstall.exe
if %counter%==0 echo %searchApp% was not found in %ProgramFiles% && echo [%DATE% %TIME%] %logPrefix% %searchApp% was not found in %ProgramFiles% >> %logPath%

echo --------------------------

::: Re-initialising the variables
set counter=0
set foundWinRAR=false

::: Searching Begins in ProgramFiles(x86)
echo Searching In ProgramFiles(x86)
echo [%DATE% %TIME%] %logPrefix% Searching In ProgramFiles(x86) >> %logPath%
echo -------------------------- >> %logPath%
cd /d %ProgramFiles(x86)%

echo **************************

::: Checking the name of each Directory
for /d  %%i in (*) do (
	if %verboseLevel%==Verbose echo [%DATE% %TIME%] %logPrefix% Checking Directory Name = %%i >> %logPath%
	if %%i==%searchApp% (
		set counter=%counter%+1
		if %%i==WinRAR set foundWinRAR=true
		echo %searchApp% Found
		echo [%DATE% %TIME%] %logPrefix% %searchApp% FOUND >> %logPath%
		)
)
echo -------------------------- >> %logPath%
if %foundWinRAR%==true echo WinRAR was Found... UnInstalling Now. && echo [%DATE% %TIME%] %logPrefix% WinRAR Found .. Changing Directory and UnInstalling >> %logPath% && cd WinRAR && uninstall.exe
if %counter%==0 echo %searchApp% was not found in %ProgramFiles(x86)% && echo [%DATE% %TIME%] %logPrefix% %searchApp% was not found in %ProgramFiles% >> %logPath%

::: Ending
echo --------------------------
echo -------------------------- >> %logPath%
echo [%DATE% %TIME%] %logPrefix% END LOG >> %logPath%

pause
