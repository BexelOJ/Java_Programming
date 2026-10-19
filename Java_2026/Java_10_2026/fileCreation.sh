
#!/bin/bash

set -e

files=(
"Java_20261020_31_FindMaximumLengthSubarrayWithPositiveSum.java"
"Java_20261020_32_FindMaximumSumRectangleInMatrix.java"
"Java_20261020_33_FindCountOfSubmatricesWithTargetSum.java"
"Java_20261020_34_FindMaximumSumOfSubarrayWithLengthK.java"
"Java_20261020_35_FindMinimumSizeSubarraySumUsingPrefixSum.java"
"Java_20261020_36_FindNumberOfRangeSum.java"
"Java_20261020_37_FindCountOfSubarraysWithOddSum.java"
"Java_20261020_38_FindCountOfSubarraysWithEvenSum.java"
"Java_20261020_39_FindMaximumAbsoluteSumOfAnySubarray.java"
"Java_20261020_40_FindProductExceptSelfUsingPrefixAndSuffix.java"
"Java_20261020_41_FindPrefixXorArray.java"
"Java_20261020_42_FindRangeXorUsingPrefixXor.java"
"Java_20261020_43_FindPrefixProductArray.java"
"Java_20261020_44_FindRangeProductUsingPrefixProduct.java"
"Java_20261020_45_FindTwoDimensionalPrefixSum.java"
"Java_20261020_46_FindRangeSumQueries.java"
"Java_20261020_47_ProcessMultipleRangeSumQueries.java"
"Java_20261020_48_FindCountOfSubarraysWithEqualSum.java"
"Java_20261020_49_FindMaximumSubarraySumWithPrefixMinimum.java"
"Java_20261020_50_FindSubarrayWithTargetAverage.java"
)

for file in "${files[@]}"; do
    printf '%s\n' "in" > "$file"
    echo "Created: $file"
done

echo "All 10 files created successfully."



