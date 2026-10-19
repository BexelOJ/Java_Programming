
#!/bin/bash

set -e

files=(
"Java_20261022_01_SelectMaximumNumberOfActivities.java"
"Java_20261022_02_ActivitySelectionWithStartAndEndTimes.java"
"Java_20261022_03_FindMinimumNumberOfPlatforms.java"
"Java_20261022_04_AssignCookiesToChildren.java"
"Java_20261022_05_FractionalKnapsackProblem.java"
"Java_20261022_06_MinimumNumberOfCoins.java"
"Java_20261022_07_FindMaximumLengthChainOfPairs.java"
"Java_20261022_08_MaximumMeetingsInOneRoom.java"
"Java_20261022_09_MinimumCostToConnectRopes.java"
"Java_20261022_10_FindMaximumNumberOfJobsThatCanBeDone.java"
"Java_20261022_11_JobSequencingWithDeadlines.java"
"Java_20261022_12_MinimumNumberOfArrowsToBurstBalloons.java"
"Java_20261022_13_NonOverlappingIntervals.java"
"Java_20261022_14_MergeOverlappingIntervals.java"
"Java_20261022_15_MinimumNumberOfIntervalsToRemove.java"
"Java_20261022_16_TaskScheduler.java"
"Java_20261022_17_ReorganizeString.java"
"Java_20261022_18_MaximumUnitsOnATruck.java"
"Java_20261022_19_MaximumLengthOfPairChain.java"
"Java_20261022_20_MinimumPlatformsForTrains.java"
"Java_20261022_21_LargestNumberFromArray.java"
"Java_20261022_22_RemoveKDigitsToMakeSmallestNumber.java"
"Java_20261022_23_BestTimeToBuyAndSellStockII.java"
"Java_20261022_24_JumpGame.java"
"Java_20261022_25_JumpGameII.java"
"Java_20261022_26_GasStationCircuit.java"
"Java_20261022_27_CandyDistribution.java"
"Java_20261022_28_BrokenCalculator.java"
"Java_20261022_29_MinimumAdditionsToMakeParenthesesValid.java"
"Java_20261022_30_MinimumNumberOfSwapsToMakeStringBalanced.java"
"Java_20261022_31_DijkstrasShortestPathAlgorithm.java"
"Java_20261022_32_PrimsMinimumSpanningTree.java"
"Java_20261022_33_KruskalsMinimumSpanningTree.java"
"Java_20261022_34_HuffmanCoding.java"
"Java_20261022_35_ConnectCitiesWithMinimumCost.java"
"Java_20261022_36_MinimumCostToConnectAllPoints.java"
"Java_20261022_37_OptimizeWaterDistributionInAVillage.java"
"Java_20261022_38_CheapestFlightsWithinKStops.java"
"Java_20261022_39_MaximumProfitInJobScheduling.java"
"Java_20261022_40_MinimumCostToHireKWorkers.java"
"Java_20261022_41_GasStationMinimumStartingFuel.java"
"Java_20261022_42_MinimumRefuelingStops.java"
"Java_20261022_43_MaximumSubarraySumUsingKadaneAlgorithm.java"
"Java_20261022_44_MinimumNumberOfTapsToWaterGarden.java"
"Java_20261022_45_CarPooling.java"
"Java_20261022_46_QueueReconstructionByHeight.java"
"Java_20261022_47_CreateMaximumNumber.java"
"Java_20261022_48_MinimumCostToMakeArrayEqual.java"
"Java_20261022_49_LexicographicallySmallestSubsequence.java"
"Java_20261022_50_MinimumInitialEnergyToFinishTasks.java"
)

for file in "${files[@]}"; do
    printf '%s\n' "in" > "$file"
    echo "Created: $file"
done

echo "All 10 files created successfully."



