#!/bin/bash

PASSWORDDB="root" 

mysql -uroot -p$PASSWORDDB -e "DROP DATABASE IF EXISTS hemosystem; CREATE DATABASE hemosystem"