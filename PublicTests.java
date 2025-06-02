import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Test;

public class PublicTests {

	int[][] pubPuzzOne =
		{{5, 3, -1, -1, 7, -1, -1, -1, -1},
			{6, -1, -1, 1, 9, 5, -1, -1, -1},
			{-1, 9, 8, -1, -1, -1, -1, 6, -1},
			{8, -1, -1, -1, 6, -1, -1, -1, 3},
			{4, -1, -1, 8, -1, 3, -1, -1, 1},
			{7, -1, -1, -1, 2, -1, -1, -1, 6},
			{-1, 6, -1, -1, -1, -1, 2, 8, -1},
			{-1, -1, -1, 4, 1, 9, -1, -1, 5},
			{-1, -1, -1, -1, 8, -1, -1, 7, 9}};

	int[][] pubPuzzTwo = {{6, 8, -1, -1, -1, 7, 1, -1, -1},
		{-1, 2, -1, 9, 1, 5, 8, -1, 7},
		{9, -1, -1, 6, -1, 3, 5, 2, -1},
		{-1, 5, 6, -1, -1, 2, -1, -1, -1},
		{3, -1, -1, -1, -1, -1, -1, -1, -1},
		{-1, 9, 2, -1, 6, -1, -1, 5, 8},
		{7, -1, -1, -1, 5, 6, -1, 8, 1},
		{-1, -1, 8, 3, 4, 9, -1, -1, 6},
		{-1, -1, -1, 8, -1, 1, 4, 3, -1}};

	int[][] pubPuzzThree = {{5, -1, -1, 2, 7, -1, -1, 1, -1},
	                        {3, 4, 2, -1, 5, -1, -1, -1, 7},
	                        {-1, -1, 7, 8, -1, 6, 2, -1, 4},
	                        {-1, 2, -1, -1, 1, 8, -1, -1, 5},
	                        {-1, 5, -1, 4, -1, 3, -1, -1, -1},
	                        {4, -1, -1, -1, -1, 2, -1, -1, -1},
	                        {6, -1, -1, -1, 2, -1, 4, -1, -1},
	                        {-1, -1, -1, -1, -1, -1, -1, -1, -1},
	                        {-1, -1, -1, 9, 8, -1, 1, 6, -1}};

	@Test
	public void publicTestOne() {
		int[][] pubPuzzOneSolution =
			{{5, 3, 4, 6, 7, 8, 9, 1, 2},
					{6, 7, 2, 1, 9, 5, 3, 4, 8},
					{1, 9, 8, 3, 4, 2, 5, 6, 7},
					{8, 5, 9, 7, 6, 1, 4, 2, 3},
					{4, 2, 6, 8, 5, 3, 7, 9, 1},
					{7, 1, 3, 9, 2, 4, 8, 5, 6},
					{9, 6, 1, 5, 3, 7, 2, 8, 4},
					{2, 8, 7, 4, 1, 9, 6, 3, 5},
					{3, 4, 5, 2, 8, 6, 1, 7, 9}};

		assertTrue(Arrays.deepEquals(StudentSolver.solve(pubPuzzOne), pubPuzzOneSolution));
	}

	@Test
	public void publicTestTwo() {
		int[][] pubPuzzTwoSolution =
			{{6, 8, 5, 4, 2, 7, 1, 9, 3},
				{4, 2, 3, 9, 1, 5, 8, 6, 7},
				{9, 7, 1, 6, 8, 3, 5, 2, 4},
				{8, 5, 6, 1, 3, 2, 7, 4, 9},
				{3, 4, 7, 5, 9, 8, 6, 1, 2},
				{1, 9, 2, 7, 6, 4, 3, 5, 8},
				{7, 3, 4, 2, 5, 6, 9, 8, 1},
				{5, 1, 8, 3, 4, 9, 2, 7, 6},
				{2, 6, 9, 8, 7, 1, 4, 3, 5}};

		//assertEquals(Solver.solve(pubPuzzTwo), pubPuzzTwoSolution);
		assertTrue(Arrays.deepEquals(StudentSolver.solve(pubPuzzTwo), pubPuzzTwoSolution));
	}

	@Test
	public void publicTestThree() {
		int[][] pubPuzzThreeSolution =
			{{5, 6, 8, 2, 7, 4, 9, 1, 3},
                    {3, 4, 2, 1, 5, 9, 6, 8, 7},
                    {1, 9, 7, 8, 3, 6, 2, 5, 4},
                    {9, 2, 6, 7, 1, 8, 3, 4, 5},
                    {8, 5, 1, 4, 9, 3, 7, 2, 6},
                    {4, 7, 3, 5, 6, 2, 8, 9, 1},
                    {6, 8, 5, 3, 2, 1, 4, 7, 9},
                    {2, 1, 9, 6, 4, 7, 5, 3, 8},
                    {7, 3, 4, 9, 8, 5, 1, 6, 2}};

		//assertEquals(Solver.solve(pubPuzzThree), pubPuzzThreeSolution);
		assertTrue(Arrays.deepEquals(StudentSolver.solve(pubPuzzThree), pubPuzzThreeSolution));
	}

}
