#!/usr/bin/expect -f
set timeout -1
spawn ssh dario@192.168.100.8
expect "password:"
send -- "a\r"
interact
