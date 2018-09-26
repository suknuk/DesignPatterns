package adapter;

public class TestEnemyAttackers {

	public static void main(String[] args) {
		
		EnemyTank rxTank = new EnemyTank();
		EnemyRobot fredTheRobot = new EnemyRobot();
		
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
		
		System.out.println("The Robot");
		fredTheRobot.reactToHuman("Paul");
		fredTheRobot.walkForward();
		fredTheRobot.smashWithHands();
		
		System.out.println("The Enemy Tank");
		rxTank.assignDriver("Frank");
		rxTank.driveForward();
		rxTank.fireWeapon();
		
		System.out.println("Robot with Adapter");
		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();

	}

}
