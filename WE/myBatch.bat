@echo off

::: LOG FILE PATH
set logPath=%USERPROFILE%\Desktop\mylog.log

::: Taking Program Name from User
set /p searchApp=Enter Program To Look for :

::: Custom While Loop
:while
	echo.
	echo Enter Verbose Level
	echo 1. Normal
	echo 2. Verbose
	set /p verboseLevel=Enter Choice :
	::: joining if statements since OR operator is not present
	if not %verboseLevel%==Normal if not %verboseLevel%==Verbose echo. && echo Invalid Choice... Retry && goto :while

::: LOG FILE FORMAT PREFIX
set logPrefix=[%DATE% %TIME%] : %verboseLevel% :

echo %logPrefix% START LOG	 > %logPath%
echo -------------------------- >> %logPath%
echo Starting Script
echo.
echo Running Set Command
echo %logPrefix% Running Set Command >> %logPath%

echo --------------------------
echo -------------------------- >> %logPath%
set
if %verboseLevel%==Verbose echo %logPrefix% Before Adding myName >> %logPath% && echo. >> %logPath% && set >> %logPath%
echo --------------------------
echo -------------------------- >> %logPath%

echo Setting myName = Akash
echo %logPrefix% Setting myName = Akash >> %logPath%
set myName=Akash

echo --------------------------
echo Running Set Command
echo %logPrefix% Running Set Command >> %logPath%
echo --------------------------
echo -------------------------- >> %logPath%
set
if %verboseLevel%==Verbose echo %logPrefix% After Adding myName >> %logPath% && echo. >> %logPath% && set >> %logPath%
echo --------------------------
echo -------------------------- >> %logPath%

::: variables for looking for the software
set counter=0
set foundWinRAR=false

echo %logPrefix% Looking for Software %searchApp% >> %logPath%
echo -------------------------- >> %logPath%

::: Searching Begins in ProgramFiles
echo Searching In ProgramFiles
echo %logPrefix% Searching In ProgramFiles  >> %logPath%
cd /d %ProgramFiles%

echo **************************

::: Checking the name of each Directory
for /d  %%i in (*) do (
	if %verboseLevel%==Verbose echo %logPrefix% Checking Directory Name = %%i >> %logPath%
	if %%i==%searchApp% (
		set counter=%counter%+1
		if %%i==WinRAR set foundWinRAR=true
		echo %searchApp% Found
		echo %logPrefix% %searchApp% FOUND >> %logPath%
		)
)
echo -------------------------- >> %logPath%

if %foundWinRAR%==true echo WinRAR was Found... UnInstalling Now. && echo %logPrefix% WinRAR Found .. Changing Directory and UnInstalling >> %logPath% && cd WinRAR && uninstall.exe
if %counter%==0 echo %searchApp% was not found in %ProgramFiles% && echo %logPrefix% %searchApp% was not found in %ProgramFiles% >> %logPath%

echo --------------------------
echo -------------------------- >> %logPath%

::: Searching Begins in ProgramFiles(x86)
echo Searching In ProgramFiles(x86)
echo %logPrefix% Searching In ProgramFiles(x86) >> %logPath%
cd /d %ProgramFiles(x86)%

echo **************************

::: Checking the name of each Directory
for /d  %%i in (*) do (
	if %verboseLevel%==Verbose echo %logPrefix% Checking Directory Name = %%i >> %logPath%
	if %%i==%searchApp% (
		set counter=%counter%+1
		if %%i==WinRAR set foundWinRAR=true
		echo %searchApp% Found
		echo %logPrefix% %searchApp% FOUND >> %logPath%
		)
)
echo -------------------------- >> %logPath%
if %foundWinRAR%==true echo WinRAR was Found... UnInstalling Now. && echo %logPrefix% WinRAR Found .. Changing Directory and UnInstalling >> %logPath% && cd WinRAR && uninstall.exe
if %counter%==0 echo %searchApp% was not found in %ProgramFiles(x86)% && echo %logPrefix% %searchApp% was not found in %ProgramFiles% >> %logPath%

::: Ending
echo --------------------------
echo -------------------------- >> %logPath%
echo %logPrefix% END LOG >> %logPath%

pause
