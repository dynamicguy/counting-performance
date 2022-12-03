# Counting performance

This repo holds the code for comparing the performance of counting to 10 million for C++, Go, Python and PHP.

## How to compile and run in C++ 

	g++ main.cpp
	time ./a.out

## How to compile and run in Go 

	go build main.go
	time ./main
	
## How to run in Python

	time python main.py
	
## How to run in PHP

	time php main.php
	

## Results

* C++: 1.66s user 0.22s system 37% cpu 5.025 total
* go:  2.40s user 4.04s system 66% cpu 9.734 total
* python: 2.31s user 0.25s system 39% cpu 6.405 total
* PHP: 2.01s user 3.93s system 60% cpu 9.783 total
