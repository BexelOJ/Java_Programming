#!/bin/bash

for f in java_*.java; do
	 mv -- "$f" "${f^}"
done


