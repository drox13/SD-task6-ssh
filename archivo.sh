declare -r DATA=/home/dario

if [ "$PWD" = "$DATA" ];
then
	echo "OK"
else
	echo "error el servidor se encuentra en otro folder"
fi
