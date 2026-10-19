
#!/bin/bash

set -e

files=(
"Java_20261025_01_FindNthFibonacciNumber.java"
"Java_20261025_02_FindFibonacciSeriesUsingDP.java"
"Java_20261025_03_FindClimbingStairsWays.java"
"Java_20261025_04_FindMinimumCostToClimbStairs.java"
"Java_20261025_05_FindNthTribonacciNumber.java"
"Java_20261025_06_FindWaysToReachNthStep.java"
"Java_20261025_07_FindMaximumSumWithoutAdjacentElements.java"
"Java_20261025_08_HouseRobberProblem.java"
"Java_20261025_09_HouseRobberII.java"
"Java_20261025_10_MinimumCostPathInGrid.java"
"Java_20261025_11_ZeroOneKnapsackProblem.java"
"Java_20261025_12_UnboundedKnapsackProblem.java"
"Java_20261025_13_SubsetSumProblem.java"
"Java_20261025_14_EqualSumPartitionProblem.java"
"Java_20261025_15_CountSubsetsWithGivenSum.java"
"Java_20261025_16_MinimumSubsetSumDifference.java"
"Java_20261025_17_CoinChangeMinimumCoins.java"
"Java_20261025_18_CoinChangeNumberOfWays.java"
"Java_20261025_19_TargetSumProblem.java"
"Java_20261025_20_LastStoneWeightII.java"
"Java_20261025_21_LongestCommonSubsequence.java"
"Java_20261025_22_LongestCommonSubstring.java"
"Java_20261025_23_LongestIncreasingSubsequence.java"
"Java_20261025_24_LongestPalindromicSubsequence.java"
"Java_20261025_25_LongestPalindromicSubstring.java"
"Java_20261025_26_EditDistance.java"
"Java_20261025_27_DistinctSubsequences.java"
"Java_20261025_28_WordBreakProblem.java"
"Java_20261025_29_WildcardMatching.java"
"Java_20261025_30_RegularExpressionMatching.java"
"Java_20261025_31_UniquePathsInGrid.java"
"Java_20261025_32_UniquePathsWithObstacles.java"
"Java_20261025_33_MinimumPathSum.java"
"Java_20261025_34_MaximumPathSumInMatrix.java"
"Java_20261025_35_TriangleMinimumPathSum.java"
"Java_20261025_36_MaximalSquare.java"
"Java_20261025_37_CountSquareSubmatricesWithAllOnes.java"
"Java_20261025_38_MinimumFallingPathSum.java"
"Java_20261025_39_CherryPickup.java"
"Java_20261025_40_DungeonGame.java"
"Java_20261025_41_MatrixChainMultiplication.java"
"Java_20261025_42_BurstBalloons.java"
"Java_20261025_43_PalindromePartitioningMinimumCuts.java"
"Java_20261025_44_BestTimeToBuyAndSellStockWithCooldown.java"
"Java_20261025_45_BestTimeToBuyAndSellStockWithTransactionFee.java"
"Java_20261025_46_BestTimeToBuyAndSellStockIV.java"
"Java_20261025_47_JobSchedulingMaximumProfit.java"
"Java_20261025_48_InterleavingString.java"
"Java_20261025_49_EggDroppingPuzzle.java"
"Java_20261025_50_LongestIncreasingPathInMatrix.java"
)

for file in "${files[@]}"; do
    printf '%s\n' "in" > "$file"
    echo "Created: $file"
done

echo "All 10 files created successfully."



