
#!/bin/bash

set -e

files=(
"Java_20261023_01_PrintNumbersFromOneToN.java"
"Java_20261023_02_PrintNumbersFromNToOne.java"
"Java_20261023_03_FindSumOfFirstNNaturalNumbers.java"
"Java_20261023_04_FindFactorialUsingRecursion.java"
"Java_20261023_05_FindPowerUsingRecursion.java"
"Java_20261023_06_FindSumOfDigitsUsingRecursion.java"
"Java_20261023_07_CountDigitsUsingRecursion.java"
"Java_20261023_08_ReverseNumberUsingRecursion.java"
"Java_20261023_09_FindProductOfDigitsUsingRecursion.java"
"Java_20261023_10_FindGCDUsingRecursion.java"
"Java_20261023_11_FindArraySumUsingRecursion.java"
"Java_20261023_12_FindMaximumElementUsingRecursion.java"
"Java_20261023_13_FindMinimumElementUsingRecursion.java"
"Java_20261023_14_CheckIfArrayIsSortedUsingRecursion.java"
"Java_20261023_15_LinearSearchUsingRecursion.java"
"Java_20261023_16_BinarySearchUsingRecursion.java"
"Java_20261023_17_ReverseArrayUsingRecursion.java"
"Java_20261023_18_CheckPalindromeUsingRecursion.java"
"Java_20261023_19_ReverseStringUsingRecursion.java"
"Java_20261023_20_RemoveCharacterFromStringUsingRecursion.java"
"Java_20261023_21_FindNthFibonacciNumberUsingRecursion.java"
"Java_20261023_22_FindFibonacciSeriesUsingRecursion.java"
"Java_20261023_23_FindLCMUsingRecursion.java"
"Java_20261023_24_ConvertDecimalToBinaryUsingRecursion.java"
"Java_20261023_25_ConvertBinaryToDecimalUsingRecursion.java"
"Java_20261023_26_CheckPrimeUsingRecursion.java"
"Java_20261023_27_FindPrimeFactorsUsingRecursion.java"
"Java_20261023_28_FindSumOfNaturalNumbersInRange.java"
"Java_20261023_29_FindHCFOfArrayUsingRecursion.java"
"Java_20261023_30_SolveTowerOfHanoi.java"
"Java_20261023_31_GenerateAllSubsets.java"
"Java_20261023_32_GenerateAllSubsequencesOfString.java"
"Java_20261023_33_GenerateAllPermutationsOfString.java"
"Java_20261023_34_GenerateAllPermutationsOfArray.java"
"Java_20261023_35_GenerateAllCombinations.java"
"Java_20261023_36_GenerateParentheses.java"
"Java_20261023_37_SolveCombinationSum.java"
"Java_20261023_38_SolveCombinationSumII.java"
"Java_20261023_39_FindAllSubsetsWithTargetSum.java"
"Java_20261023_40_FindAllPathsInMaze.java"
"Java_20261023_41_SolveNQueensProblem.java"
"Java_20261023_42_SolveSudoku.java"
"Java_20261023_43_SolveRatInMaze.java"
"Java_20261023_44_SolveWordSearch.java"
"Java_20261023_45_FindKnightTours.java"
"Java_20261023_46_SolveGraphColoringProblem.java"
"Java_20261023_47_FindHamiltonianPaths.java"
"Java_20261023_48_SolvePalindromePartitioning.java"
"Java_20261023_49_FindAllExpressionsThatEvaluateToTarget.java"
"Java_20261023_50_SolveJosephusProblemUsingRecursion.java"
)

for file in "${files[@]}"; do
    printf '%s\n' "in" > "$file"
    echo "Created: $file"
done

echo "All 10 files created successfully."



