#!/bin/bash

for file in Java_20260820_AF_*.java; do
    mv "$file" "Java_20260821_AF_${file#Java_20260820_AF_}"
done


