void main() {
  List<int> nums = [1, 2, 3, 4, 5, 6, 7, 8, 9];
  int target = 15;

  List<int>? result = twoSum(nums, target);

  if (result != null) {
    print(result); // Print the list directly in Dart
  } else {
    print('No two numbers add up to the target.');
  }
}

List<int>? twoSum(List<int> nums, int target) {
  for (int i = 0; i < nums.length; i++) {
    for (int j = i + 1; j < nums.length; j++) {
      if (nums[i] + nums[j] == target) {
        return [i, j]; // Return the indices as a list in Dart
      }
    }
  }
  return null;
}
