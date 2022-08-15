@echo off
if exist ./../lang/#check# (
#rund.bat okrrun
) else (
goto crash
)
exit
:crash
echo crashed!
echo 크래쉬가발생했습니다
echo 파일의 유효성을 확인하지못했습니다(1/errorcode_runscrpt_no_checkfile)
echo 10초후 종료됨니다.
timeout /t 10 >nul
exit