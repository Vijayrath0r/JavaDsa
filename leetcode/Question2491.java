package leetcode;

import java.util.Arrays;

/**
 * Question2491 - Divide Players Into Teams of Equal Skill
 */
public class Question2491 {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long result = 0;
        int left = 0;
        int right = skill.length - 1;
        int expectedSum = skill[left] + skill[right];
        while (left < right) {
            if (expectedSum != skill[left] + skill[right]) {
                return -1;
            }
            result += (long) (skill[left] * skill[right]);
            left++;
            right--;
        }
        return result;
    }

    public static void main(String[] args) {
        Question2491 solution = new Question2491();

        int[] skill = { 3, 2, 5, 1, 3, 4 };

        System.out.println(solution.dividePlayers(skill));
    }
}