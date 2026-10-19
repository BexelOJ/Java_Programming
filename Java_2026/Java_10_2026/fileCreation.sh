
#!/bin/bash

set -e

files=(
"Java_20261024_01_GenerateAllBinaryStrings.java"
"Java_20261024_02_GenerateBinaryStringsWithoutConsecutiveOnes.java"
"Java_20261024_03_GenerateAllSubsets.java"
"Java_20261024_04_GenerateAllSubsequencesOfString.java"
"Java_20261024_05_GenerateAllPermutationsOfString.java"
"Java_20261024_06_GenerateAllPermutationsOfArray.java"
"Java_20261024_07_GenerateAllCombinations.java"
"Java_20261024_08_FindSubsetsWithTargetSum.java"
"Java_20261024_09_FindAllPathsInGrid.java"
"Java_20261024_10_GenerateBalancedParentheses.java"
"Java_20261024_11_SolveCombinationSum.java"
"Java_20261024_12_SolveCombinationSumII.java"
"Java_20261024_13_SolveCombinationSumIII.java"
"Java_20261024_14_FindUniqueSubsetsWithDuplicates.java"
"Java_20261024_15_FindUniquePermutationsWithDuplicates.java"
"Java_20261024_16_PalindromePartitioning.java"
"Java_20261024_17_RestoreIPAddresses.java"
"Java_20261024_18_FindAllValidExpressions.java"
"Java_20261024_19_LetterCombinationsOfPhoneNumber.java"
"Java_20261024_20_GenerateAllPossibleAbbreviations.java"
"Java_20261024_21_SolveRatInMaze.java"
"Java_20261024_22_FindAllPathsInMazeWithObstacles.java"
"Java_20261024_23_FindShortestPathInMazeUsingBacktracking.java"
"Java_20261024_24_SolveWordSearch.java"
"Java_20261024_25_FindAllWordSearchPaths.java"
"Java_20261024_26_SolveSudoku.java"
"Java_20261024_27_SolveNQueensProblem.java"
"Java_20261024_28_SolveKnightTourProblem.java"
"Java_20261024_29_FindAllHamiltonianPaths.java"
"Java_20261024_30_SolveGraphColoringProblem.java"
"Java_20261024_31_SolveCryptarithmeticPuzzle.java"
"Java_20261024_32_SolveCrosswordPuzzle.java"
"Java_20261024_33_FindAllTopologicalSorts.java"
"Java_20261024_34_FindAllSimplePathsInGraph.java"
"Java_20261024_35_FindAllCyclesInGraph.java"
"Java_20261024_36_FindAllSpanningTrees.java"
"Java_20261024_37_SolveEqualSumPartition.java"
"Java_20261024_38_FindKthPermutationSequence.java"
"Java_20261024_39_FindAllDerangements.java"
"Java_20261024_40_SolveTugOfWarProblem.java"
"Java_20261024_41_SolveKnightPlacementProblem.java"
"Java_20261024_42_FindMaximumGoldInGrid.java"
"Java_20261024_43_FindMaximumNumberByKSwaps.java"
"Java_20261024_44_FindAllExpressionsThatEvaluateToTarget.java"
"Java_20261024_45_SolveWordBreakII.java"
"Java_20261024_46_FindAllPossibleSentencesFromDictionary.java"
"Java_20261024_47_FindOptimalAssignmentProblem.java"
"Java_20261024_48_SolveTravelingSalesmanProblem.java"
"Java_20261024_49_FindAllValidSudokuSolutions.java"
"Java_20261024_50_SolveJosephusProblemUsingBacktracking.java"
)

for file in "${files[@]}"; do
    printf '%s\n' "in" > "$file"
    echo "Created: $file"
done

echo "All 10 files created successfully."



