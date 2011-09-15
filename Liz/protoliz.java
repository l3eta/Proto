/*

  /\___/¯¯¯¯¯¯¯¯¯\ '‚            		   /\            /\                                     /\ ‚             
 /    \|   |:'\    \‘   '        	      /  \          /  \____________________'              /  \   ‚         
|\         |:::|    | '‚                 |\    \     '‚ |                       \°            /   /|
|:|        |::/    /|‘   '|\¯¯¯¯¯¯¯¯¯¯¯¯\|     | '‚     |\_______          ___   \'          |   |:|/¯¯¯¯¯¯¯\‚
|:|        |/    /::|°    |:|        |\_______/|     	|:|::::::|\        \:|\  /|°         |\   \/   /|    |'
 \|             (:::'|   °|:|        ¯¯¯¯¯|::|:|     	|:|::::::|::\    	\::\/:|          |::\_____/:/'   /|'
  |        |\    \:/‘      \|        |¯/¯¯¯¯¯¯¯¯\ °      \|::::::|::::\    	 \:|::|     /¯¯¯¯¯¯¯¯¯¯¯¯¯\/   /::|°
  |        |::\    \‘       |        |/  /|\     \‚        ¯¯¯¯¯¯ \::::\      \::/‘    /      /|          /::::|°
  |        |::::\    \ ‘   /__________ /::|:|     |                \:::|      |/'     /      /:/         /:::::/‘
 /         |:::::|    |   |::::::::::|::::|/      /|                \'/       /|‘    |'      |/         |:::::/
|\    /|\   \:::/    /|   |::::::::::|::/ |\     /::|                |\      /:|'    |\__________/|\     \::/'
|::\/::|::\________ /:|   |::::::::::|/   |:\   /::::|               |::\   /:::|'   |:|:::::::|:|::\    /:|
|:::|::|:::|:::::::|::|‘   ¯¯¯¯¯¯¯¯¯¯¯	  '|::\/:::::/               |:::'\/:::/‘    |:|:::::::|:|::::\/:::|       
 \::'|:/\::|:::::::|:/'                  	\:::|:::/ '‚              \:::|:::/ '‚   '\|:::::::|/ \:::|:::|‘      
  '\|/   \|:::::::|/'                  	     \::|::/'‚                 \::|::/ '‚      ¯¯¯¯¯¯¯¯    \::|::/       
		  ¯¯¯¯¯¯¯¯'‚                    	   \|/°                      \|/°                        \|/         


 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import org.rsbot.event.listeners.PaintListener;
import org.rsbot.script.Script;
import org.rsbot.script.ScriptManifest;
import org.rsbot.script.methods.Game.Tab;
import org.rsbot.script.methods.Skills;
import org.rsbot.script.wrappers.RSArea;
import org.rsbot.script.wrappers.RSGroundItem;
import org.rsbot.script.wrappers.RSItem;
import org.rsbot.script.wrappers.RSObject;
import org.rsbot.script.wrappers.RSTile;

@ScriptManifest(authors = { "l3eta" }, keywords = "Local" , name = "ProtoLiz", version = 4.045, description = "Fuck Cows Not Chickens x]")
public class protoliz extends Script implements PaintListener {
	RSTile[] t1l = { new RSTile(3501, 3490), new RSTile(3507, 3503), 
			new RSTile(3521, 3498), new RSTile(3525, 3487),
			new RSTile(3527, 3476), new RSTile(3520, 3464),
			new RSTile(3519, 3452), new RSTile(3528, 3442),
			new RSTile(3536, 3448) };
	RSTile[] t1b = { new RSTile(3525, 3440), new RSTile(3519, 3450),
			new RSTile(3520, 3464), new RSTile(3526, 3475),
			new RSTile(3524, 3488), new RSTile(3522, 3502),
			new RSTile(3509, 3505), new RSTile(3500, 3494),
			new RSTile(3504, 3482), new RSTile(3510, 3480) };
	RSTile[] t2l = { new RSTile(3501, 3490), new RSTile(3507, 3503),
			new RSTile(3521, 3498), new RSTile(3525, 3487),
			new RSTile(3527, 3476), new RSTile(3520, 3464),
			new RSTile(3519, 3452), new RSTile(3528, 3442),
			new RSTile(3536, 3448), new RSTile(3543, 3450),
			new RSTile(3551, 3450) };
	RSTile[] t2b = { new RSTile(3542, 3450), new RSTile(3531, 3445),
			new RSTile(3520, 3449), new RSTile(3520, 3461),
			new RSTile(3524, 3474), new RSTile(3524, 3486),
			new RSTile(3522, 3497), new RSTile(3516, 3510),
			new RSTile(3507, 3503), new RSTile(3501, 3492),
			new RSTile(3505, 3485), new RSTile(3510, 3480) };
	RSTile[] t3l = { new RSTile(3502, 3489), new RSTile(3504, 3500),
			new RSTile(3517, 3502), new RSTile(3522, 3492),
			new RSTile(3525, 3483), new RSTile(3527, 3474),
			new RSTile(3522, 3464), new RSTile(3518, 3454),
			new RSTile(3519, 3442), new RSTile(3529, 3442),
			new RSTile(3539, 3449), new RSTile(3548, 3450),
			new RSTile(3558, 3453), new RSTile(3569, 3454),
			new RSTile(3565, 3446), new RSTile(3561, 3436),
			new RSTile(3549, 3440) };
	RSTile[] t3b = { new RSTile(3557, 3437), new RSTile(3563, 3443),
			new RSTile(3572, 3440), new RSTile(3580, 3445),
			new RSTile(3575, 3452), new RSTile(3566, 3454),
			new RSTile(3556, 3453), new RSTile(3545, 3450),
			new RSTile(3534, 3448), new RSTile(3522, 3440),
			new RSTile(3519, 3449), new RSTile(3519, 3462),
			new RSTile(3524, 3470), new RSTile(3525, 3477),
			new RSTile(3522, 3488), new RSTile(3521, 3501),
			new RSTile(3515, 3511), new RSTile(3508, 3504),
			new RSTile(3500, 3492), new RSTile(3502, 3484),
			new RSTile(3511, 3480) };

	RSArea ta1t2 = new RSArea(new RSTile(3531, 3444), new RSTile(3539, 3446)),
			ta2t2 = new RSArea(new RSTile(3547, 3448), new RSTile(3554, 3451));
	RSArea ta1 = new RSArea(new RSTile(3531, 3444), new RSTile(3539, 3452)),
			ta2 = new RSArea(new RSTile(3547, 3448), new RSTile(3556, 3454)),
			ta3 = new RSArea(new RSTile(3546, 3436), new RSTile(3550, 3443));
	RSArea traparea = null;
	RSTile[] bankpath = null, lizardpath = null;
	RSArea bankarea = new RSArea(new RSTile(3509, 3483), new RSTile(3515, 3474));
	int[] food = { 15272, 385, 7946, 373, 365, 379, 361 };
	int ic, trapcount = 2, ca, tr, started = 0, chp = 0;
	int count, tb = 0, startExp, startLevel, price;
	int hp = 0, paint = 0, mo = 0;
	long start;
	String status = "START IN BANK";
	boolean ph = false, three, pw = false, eat = false;

	Image chat = loadImage("chat");
	Image inv = loadImage("inv");

	kk proto = new kk();
	dialog message = new dialog();

	public boolean onStart() {
		aTele();
		
		if (skills.getCurrentLevel(21) >= 9000) {
			proto.setVisible(true);
			while (proto.isVisible()) {
				sleep(50);
			}
			if (!proto.isVisible() && started == 0) {
				return false;
			} else if (!proto.isVisible() && started == 1) {
				hp = (skills.getCurrentLevel(Skills.CONSTITUTION) * 10);
				log(ph ? "Banking is enabled." : "Banking is disabled. Using PowerMode.");				
				startLevel = skills.getCurrentLevel(21);
				startExp = skills.getCurrentExp(21);
				start = System.currentTimeMillis();
				checkversion();
				bankfix();
				price = grandExchange.lookup(10149).getGuidePrice();
			}
		} else if (skills.getCurrentLevel(21) <= 29) {
			log.severe("Error: Hunter Level 29 is needed, Your Level: "
					+ skills.getCurrentLevel(21));
			return false;
		}
		return false;
	}
	
	public int loop() {
		if (pw && inventory.isFull()
				&& traparea.contains(getMyPlayer().getLocation())) {
			dropMethod();
		}
		try {
			chp = Integer.parseInt(interfaces.getComponent(748, 8).getText());
		} catch (NumberFormatException ex) {
		}

		ic = inventory.getCount(10149);
		if (!isMoving()
				&& traparea.contains(getMyPlayer().getLocation())) {
			if (tr == 3) {
				if (getMyPlayer().getLocation().getX() == 3546
						&& getMyPlayer().getLocation().getY() == 3442
						|| getMyPlayer().getLocation().getX() == 3549
						&& getMyPlayer().getLocation().getY() == 3438) {
					if (calc.tileOnScreen(new RSTile(3548, 3440))) {
						if (!isMoving() && !inventory.isFull()) {
							tiles.interact(new RSTile(3548, 3440), "Walk");
							sleep(750);
						}
					} else {
						if (!isMoving() && !inventory.isFull()) {
							walking.walkTo(new RSTile(3548, 3440));
							sleep(750);
						}
					}
				}
			}
			if (tr == 2) {
				if (getMyPlayer().getLocation().getX() == 3548
						&& getMyPlayer().getLocation().getY() == 3449
						|| getMyPlayer().getLocation().getX() == 3551
						&& getMyPlayer().getLocation().getY() == 3450
						|| getMyPlayer().getLocation().getX() == 3555
						&& getMyPlayer().getLocation().getY() == 3453) {
					if (calc.tileOnScreen(new RSTile(3551, 3451))) {
						if (!isMoving() && !inventory.isFull()) {
							tiles.interact(new RSTile(3551, 3451), "Walk");
							sleep(750);
						}
					} else {
						if (!isMoving() && !inventory.isFull()) {
							walking.walkTo(new RSTile(3551, 3451));
							sleep(750);
						}
					}
				}
			}
			if (tr == 1) {
				if (getMyPlayer().getLocation().getX() == 3537
						&& getMyPlayer().getLocation().getY() == 446
						|| getMyPlayer().getLocation().getX() == 3533
						&& getMyPlayer().getLocation().getY() == 3446
						|| getMyPlayer().getLocation().getX() == 3538
						&& getMyPlayer().getLocation().getY() == 3451) {
					if (calc.tileOnScreen(new RSTile(3536, 3448))) {
						if (!isMoving() && !inventory.isFull()) {
							tiles.interact(new RSTile(3536, 3448), "Walk");
							sleep(750);
						}
					} else {
						if (!isMoving() && !inventory.isFull()) {
							walking.walkTo(new RSTile(3536, 3448));
							sleep(750);
						}
					}
				}
			}
		}

		if (!isMoving()
				&& pw == false
				&& (getMyPlayer().getLocation() == new RSTile(3536, 3448)
						|| getMyPlayer().getLocation() == new RSTile(3551, 3451) || getMyPlayer()
						.getLocation() == new RSTile(3548, 3440))) {
			RSGroundItem rope = groundItems.getNearest(954);
			RSGroundItem net = groundItems.getNearest(303);
			if (rope != null && !inventory.isFull()) {
				if (traparea.contains(rope.getLocation())) {
					status = "Getting Failed Trap.";
					camera.turnTo(rope.getLocation());
					sleep(50);
					rope.interact("Take");
					sleep(750);
				}
			} else if (net != null && !inventory.isFull()) {
				if (traparea.contains(net.getLocation())) {
					status = "Getting Failed Trap.";
					camera.turnTo(net.getLocation());
					sleep(50);
					net.interact("Take");
					sleep(750);
				}
			} else {
				ab();
			}
		}

		if (!walking.isRunEnabled()) {
			if (walking.getEnergy() >= 35) {
				walking.setRun(true);
				sleep(100);
			}
		}

		if (bankarea.contains(getMyPlayer().getLocation())
				&& inventory.contains(303) && inventory.contains(954)
				&& !traparea.contains(getMyPlayer().getLocation())
				&& !inventory.isFull()
				|| !bankarea.contains(getMyPlayer().getLocation())
				&& inventory.contains(303) && inventory.contains(954)
				&& !traparea.contains(getMyPlayer().getLocation())
				&& !inventory.isFull()) {
			if (inventory.getCount(303) == trapcount && inventory.getCount(954) == trapcount) {
				walk(false);
			} else {
				bankfix();
			}
		}
		if (bankarea.contains(getMyPlayer().getLocation())
				&& inventory.isFull()) {
			bankmethod();
		}
		if (traparea.contains(getMyPlayer().getLocation())
				&& inventory.isFull()
				|| !traparea.contains(getMyPlayer().getLocation())
				&& inventory.isFull()) {
			if (!ph) {
				pw = true;
			} else if (ph) {
				walk(true);
			}
		}

		if (traparea.contains(getMyPlayer().getLocation())
				&& inventory.contains(303) && inventory.contains(954)
				&& !inventory.isFull()
				|| traparea.contains(getMyPlayer().getLocation())
				&& !inventory.contains(303) && !inventory.contains(954)
				&& !inventory.isFull()
				|| traparea.contains(getMyPlayer().getLocation())
				&& !inventory.contains(303) && inventory.contains(954)
				&& !inventory.isFull()
				|| traparea.contains(getMyPlayer().getLocation())
				&& inventory.contains(303) && !inventory.contains(954)
				&& !inventory.isFull()) {
			RSGroundItem rope = groundItems.getNearest(954);
			RSGroundItem net = groundItems.getNearest(303);
			if (rope != null && !inventory.isFull()) {
				if (traparea.contains(rope.getLocation())) {
					status = "Getting Failed Trap.";
					camera.turnTo(rope.getLocation());
					sleep(50);
					rope.interact("Take");
					sleep(750);
				}
			} else if (net != null && !inventory.isFull()) {
				if (traparea.contains(net.getLocation())) {
					status = "Getting Failed Trap.";
					camera.turnTo(net.getLocation());
					sleep(50);
					net.interact("Take");
					sleep(750);
				}
			} else {
				trapmethod();
			}
		}
		return random(100, 200);
	}

	public void bankfix() {
		if (three) {
			if (inventory.getCount(303) != 3 && inventory.getCount(954) != 3) {
				if (!bank.isOpen()) {
					bank.open();
				}
				if (bank.isOpen()) {
					if (inventory.getCount() > 1) {
						bank.depositAll();
					}
					sleep(250);
					bank.withdraw(954, 3);
					sleep(500);
					bank.withdraw(303, 3);
					sleep(500);
					if (check(303, 3) && check(954, 3)) {
						bank.close();
					}
				}
			}			
		} else if (!three) {
			if (inventory.getCount(303) != 2 && inventory.getCount(954) != 2) {
				if (!bank.isOpen()) {
					bank.open();
				}
				if (bank.isOpen()) {
					if (inventory.getCount() > 1 && !check(303, 2) && !check(954, 2)) {
						bank.depositAll();
					}
					sleep(250);
					bank.withdraw(303, 2);
					sleep(500);
					bank.withdraw(954, 2);
					sleep(500);
					if (inventory.getCount(303) == 2
							&& inventory.getCount(954) == 2) {
						bank.close();
					}
				}
			}
		}
	}

	public void dropMethod() {
		while (inventory.contains(10149)) {
			inventory.dropAllExcept(303, 954);
		}
		pw = false;
	}
	
	private boolean checkLoc(int x, int y) {
		return getMyPlayer().getLocation() == new RSTile(x, y);
	}
	
	private boolean check(int item, int amount) {
		return inventory.getCount(item) == amount;
	}
	
	private boolean iCheck(int id, int a) {
		return inventory.getCount(id) >= a;
	}
	
	private void aTele() {
		/*
		 * Component to click: 193, 42
		 * Texture id: 393 <-- no runes
		 * Texture id: 392 <-- has runes
		 * Law rune: 563 Blood rune: 565
		 */
		if(iCheck(563, 2) && iCheck(565, 1)) {
			game.openTab(Tab.MAGIC);
		}
		//stopScript();
		
	}	
	
	private boolean isMoving() {
		return getMyPlayer().isMoving();
	}

	public void trapmethod() {
		RSObject t = objects.getNearest(19679);
		RSObject tc = objects.getNearest(19675);
		RSObject ts = objects.getNearest(19678);
		if (!three) {
			if (traparea.contains(getMyPlayer().getLocation())
					&& !inventory.isFull() && !pw) {
				if (ca == 0) {
					camera.setPitch(3072);
					ca = 1;
				}
				if (ic == 25) {
					inventory.getItem(10149).interact("Release");
				}
				if (ic == 23 && check(303, 1) && check(954, 1)) {
					if (tc != null) {
						if (traparea.contains(tc.getLocation())) {
							tc.interact("Check");
							status = "Checking Trap.";
							sleep(random(600, 750));

						}
					}
				}
				if (ic == 23 && check(303, 2) && check(954, 2)) {
					if (t != null && inventory.contains(303) && inventory.contains(954) && !inventory.isFull()) {
						if (traparea.contains(t.getLocation())) {
							status = "Setting Trap.";
							t.interact("Set-trap");
							sleep(random(1500, 1600));
						}
					}
				}
				if (ic == 24) {
					if (ts != null) {
						if (traparea.contains(ts.getLocation())) {
							ts.interact("Dismantle");
							sleep(random(600, 750));
						}
					} else if (tc != null) {
						if (traparea.contains(tc.getLocation())) {
							inventory.getItem(10149).interact("Release");
							tc.interact("Check");
							status = "Checking Trap.";
							sleep(random(600, 750));
						}
					}
				}
				if (ic <= 23) {
					if (t != null && inventory.contains(303)
							&& inventory.contains(954) && !inventory.isFull()) {
						if (traparea.contains(t.getLocation())) {
							status = "Setting Trap.";
							t.interact("Set-trap");
							sleep(random(1500, 1600));
						}
					}
					if (tc != null && !inventory.isFull()) {
						if (traparea.contains(tc.getLocation())) {
							tc.interact("Check");
							status = "Checking Trap.";
							sleep(random(600, 750));
						}
					}
				}
			}
		} else if (three) {
			if (ic == 23) {
				inventory.getItem(10149).interact("Release");
			}
			if (ic == 20 && check(303, 1) && check(954, 1)) {
				if (tc != null) {
					if (traparea.contains(tc.getLocation())) {
						tc.interact("Check");
						status = "Checking Trap.";
						sleep(random(600, 750));
					}
				}
			}
			if (ic == 20 && check(303, 2) && check(954, 2)) {
				if (t != null && inventory.contains(303)
						&& inventory.contains(954) && !inventory.isFull()) {
					if (traparea.contains(t.getLocation())) {
						status = "Setting Trap.";
						t.interact("Set-trap");
						sleep(random(1500, 1600));
					}
				}
			}
			if (ic == 21 && check(303, 1) && check(954, 1)) {
				if (tc != null) {
					if (traparea.contains(tc.getLocation())) {
						tc.interact("Check");
						status = "Checking Trap.";
						sleep(random(600, 750));
					}
				} else if (ts != null) {
				} else {
					if (t != null && inventory.contains(303)
							&& inventory.contains(954) && !inventory.isFull()) {
						if (traparea.contains(t.getLocation())) {
							status = "Setting Trap.";
							t.interact("Set-trap");
							sleep(random(1500, 1600));
						}
					}
				}
			} else if (ic == 21 && check(303, 2) && check(954, 2)) {
				if (tc != null) {
					if (traparea.contains(tc.getLocation())) {
						tc.interact("Check");
						status = "Checking Trap.";
						sleep(random(600, 750));
					}
				}
			} else if (ic == 21 && check(303, 3) && check(954, 3)) {
				if (t != null && inventory.contains(303) && inventory.contains(954) && !inventory.isFull()) {
					if (traparea.contains(t.getLocation())) {
						status = "Setting Trap.";
						t.interact("Set-trap");
						sleep(random(1500, 1600));
					}
				}
			}
			if (ic == 22 && check(303, 2) && check(954, 2)) {
				if (tc != null) {
					if (traparea.contains(tc.getLocation())) {
						inventory.getItem(10149).interact("Release");
						tc.interact("Check");
						status = "Checking Trap.";
						sleep(random(600, 750));
					}
				}
				if (ts != null) {
					if (traparea.contains(ts.getLocation())) {
						ts.interact("Dismantle");
						status = "Dismantling Trap.";
						sleep(random(600, 750));
					}
				}
			}
			if (ic <= 20) {
				if (t != null && inventory.contains(303)
						&& inventory.contains(954) && !inventory.isFull()) {
					if (traparea.contains(t.getLocation())) {
						status = "Setting Trap.";
						t.interact("Set-trap");
						sleep(random(1500, 1600));
					}
				}
				if (tc != null) {
					if (traparea.contains(tc.getLocation())) {
						tc.interact("Check");
						status = "Checking Trap.";
						sleep(random(600, 750));
					}
				}
			}
		}
	}

	private void walk(boolean bank) {
		if(bank) {
			status = "Walking To Bank.";
			if (traparea.contains(getMyPlayer().getLocation())
					&& inventory.isFull()
					|| !traparea.contains(getMyPlayer().getLocation())
					&& inventory.isFull()) {
				RSTile arstile[] = randomizePath(bankpath, 2, 2);
				if (calc.distanceTo(walking.getDestination()) <= 5) {
					walkPathMM(arstile);
					sleep(500, 750);
					cab();
				}
			}
		} else {
			status = "Walking To Lizards.";
			if (bankarea.contains(getMyPlayer().getLocation())
					&& inventory.contains(303) && inventory.contains(954)
					|| !bankarea.contains(getMyPlayer().getLocation())
					&& inventory.contains(303) && inventory.contains(954)) {
				walkPathMM(lizardpath);
				RSTile arstile[] = randomizePath(lizardpath, 2, 2);
				if (calc.distanceTo(walking.getDestination()) <= 5) {
					walkPathMM(arstile);
					sleep(500, 600);
					cab();
				}
			}
		}
	}
	
	
	public void takeFood() {
		if (bank.isOpen()) {
			for (int i : food) {
				if (bank.getItem(i) != null) {
					log("Taking one of " + bank.getItem(i).getName()
							+ " to heal you :)");
					bank.withdraw(i, 3);
					sleep(200);
					eatFood();
				}
			}
		}
	}

	public void eatFood() {
		if (bank.isOpen()) {
			bank.close();
		}
		if (!bank.isOpen() && inventory.containsOneOf(food)) {
			if (inventory.containsOneOf(food)) {
				while (inventory.containsOneOf(food)) {
					inventory.getItem(food).doClick(true);
					sleep(500);
				}
				sleep(100);
			}
		}
	}

	public void bankmethod() {
		if (bankarea.contains(getMyPlayer().getLocation())
				&& inventory.isFull()) {
			status = "Depositing Lizards.";
			if (!bank.isOpen()) {
				bank.open();
			}
			if (bank.isOpen()) {
				bank.depositAllExcept(303, 954);
				sleep(250);
				ca = 0;
				tb++;
				if (eat == true) {
					if (chp <= (hp / 2)) {
						takeFood();
					} else {
						bank.close();
					}
				} else {
					bank.close();
				}
			}
		}
	}

	public void onFinish() {
		if (started == 0) {
			log.severe("Failed To Start UP -- GUI Closed");
		} else {
			long millis = System.currentTimeMillis() - start, hours = millis
					/ (1000 * 60 * 60);
			millis -= hours * (1000 * 60 * 60);
			long minutes = millis / (1000 * 60);
			millis -= minutes * (1000 * 60);
			long seconds = millis / 1000;

			log("-> Finishing Some Things.");
			log("-> Runtime:" + hours + " Hours, " + minutes + " Minutes, "
					+ seconds + " Seconds.");
			checkversion();
			log("-> Done -- Closing Script");
		}
	}

	public Image loadImage(String name) {
		try {
			return ImageIO
					.read(new URL("http://l3eta.com/scripts/protoliz/images/"
							+ name + ".png"));
		} catch (IOException e) {
		}
		return null;
	}

	public void onRepaint(Graphics g) {
		if (game.isLoggedIn() && isRunning() && started == 1) {
			long time = System.currentTimeMillis() - start;
			g.setColor(Color.white);
			g.drawLine(mouse.getLocation().x - 14, mouse.getLocation().y,
					mouse.getLocation().x + 14, mouse.getLocation().y);
			g.drawLine(mouse.getLocation().x, mouse.getLocation().y - 14,
					mouse.getLocation().x, mouse.getLocation().y + 14);
			g.setColor(Color.black);
			g.drawOval(mouse.getLocation().x - 7, mouse.getLocation().y - 7,
					14, 14);
			g.drawLine(mouse.getLocation().x - 1000, mouse.getLocation().y,
					mouse.getLocation().x - 7, mouse.getLocation().y);
			g.drawLine(mouse.getLocation().x + 1000, mouse.getLocation().y,
					mouse.getLocation().x + 7, mouse.getLocation().y);
			g.drawLine(mouse.getLocation().x, mouse.getLocation().y - 1000,
					mouse.getLocation().x, mouse.getLocation().y - 7);
			g.drawLine(mouse.getLocation().x, mouse.getLocation().y + 1000,
					mouse.getLocation().x, mouse.getLocation().y + 7);

			int xptolvl = skills.getExpToNextLevel(21);
			int xpgained = skills.getCurrentExp(21) - startExp;
			count = (skills.getCurrentExp(21) - startExp) / 152;

			int w = (int) Math.round(((count * price) * 3600000D / (System
					.currentTimeMillis() - start)));
			int x = (int) Math.round((count * 3600000D / (System
					.currentTimeMillis() - start)));
			int y = (int) Math.round((xpgained * 3600000D / (System
					.currentTimeMillis() - start)));
			long z = (long) ((double) xptolvl / (double) y * 3600000);
			if (paint == 0) {
				g.drawImage(chat, 6, 344, null);
				g.setFont(new Font("Arial", 1, 12));
				g.setColor(Color.white);

				g.drawString("Status: " + status, 23, 375);
				g.drawString("RunTime: " + f(time), 23, 390);
				g.drawString("Banked: " + tb + " Times.", 23, 405);
				g.drawString("Hunter Level: " + skills.getCurrentLevel(21), 23,
						428);
				g.drawString("Levels Gained: "
						+ (skills.getCurrentLevel(21) - startLevel), 23, 443);

				if (xpgained == 0) {
					g.drawString("Time To " + (skills.getCurrentLevel(21) + 1)
							+ ": 00:00:00", 23, 458);
				} else {
					g.drawString("Time To " + (skills.getCurrentLevel(21) + 1)
							+ ": " + f(z), 23, 458);
				}

				g.drawString("Lizard Price: " + price, 180, 375);
				g.drawString("Money Gained: " + count * price, 180, 390);
				g.drawString("Money Hour: " + w, 180, 405);
				g.drawString("Lizards Caught: " + count, 180, 428);
				g.drawString("Lizards Hourly: " + x, 180, 443);
				g.drawString("Lizards Til " + (skills.getCurrentLevel(21) + 1)
						+ ": " + skills.getExpToNextLevel(21) / 152, 180, 458);

				g.drawString("Xp Gained: " + xpgained, 325, 375);
				g.drawString("Xp Til " + (skills.getCurrentLevel(21) + 1)
						+ ": " + xptolvl, 325, 390);
				g.drawString("Xp Hourly: " + y, 325, 405);
				g.drawString("Paint By: Popm4n, l3eta", 325, 443);
				g.drawString("Protoliz By: l3eta", 325, 458);
				g.drawString(
						"Script Verison: "
								+ protoliz.class.getAnnotation(
										ScriptManifest.class).version(), 325,
						428);
			} else if (paint == 1) {
				g.drawImage(inv, 547, 204, null);
				g.setFont(new Font("Miriam", 0, 13));
				g.setColor(Color.white);
				g.drawString("Lizards Caught: " + count, 560, 360);
				g.drawString("Lizards Hourly: " + x, 560, 370);
				g.drawString("Status: " + status, 560, 240);
				g.drawString("RunTime: " + f(time), 560, 250);
				g.drawString("Banked: " + tb + " Times.", 560, 260);
				g.drawString("Lizard Price: " + price, 560, 280);
				g.drawString("Cash Gained: " + count * price, 560, 290);
				g.drawString("Cash Hourly: " + w, 560, 300);
				g.drawString("Xp Gained: " + xpgained, 560, 320);
				g.drawString("Xp Hourly: " + y, 560, 330);
				g.drawString("Xp Til " + (skills.getCurrentLevel(21) + 1)
						+ ": " + xptolvl, 560, 340);
				g.drawString("Lizards Til " + (skills.getCurrentLevel(21) + 1)
						+ ": " + skills.getExpToNextLevel(21) / 152, 560, 381);
				g.drawString("Hunter Level: " + skills.getCurrentLevel(21),
						560, 400);
				g.drawString("Levels Gained: "
						+ (skills.getCurrentLevel(21) - startLevel), 560, 410);
				if (xpgained == 0) {
					g.drawString("Time To " + (skills.getCurrentLevel(21) + 1)
							+ ": 00:00:00", 560, 420);
				} else {
					g.drawString("Time To " + (skills.getCurrentLevel(21) + 1)
							+ ": " + f(z), 560, 420);
				}
				g.drawString(
						"Version: "
								+ protoliz.class.getAnnotation(
										ScriptManifest.class).version(), 560,
						440);
				g.drawString("Paint By: Popm4n, l3eta", 560, 450);
			}
		}
	}

	private String f(final long time) {
		 
		final int sec = (int) (time / 1000), h = sec / 3600, m = sec / 60 % 60, s = sec % 60;
		return (h < 10 ? "0" + h : h) + ":" + (m < 10 ? "0" + m : m) + ":"
				+ (s < 10 ? "0" + s : s);
	}

	private double getVer() {
		return protoliz.class.getAnnotation(ScriptManifest.class).version();
	}
	
	private boolean checkversion() {
		try {
			Double ver = 0.0;
			BufferedReader in = new BufferedReader(new InputStreamReader(new URL("http://l3eta.com/proto/liz/v.file").openStream()));
			String line;
			while ((line = in.readLine()) != null) {
				ver = Double.parseDouble(line);
			}
			if (ver < 0) {
				in.close();
				log(Color.red, "-> Unable to find the new version - update failed");
				return false;
			} else if (getVer() == ver) {
				in.close();
				log(Color.gray, "-> You have the latest script version");
				return false;
			}
			log.warning("-> Update found! Your Version: " + getVer() + ". New Version: " + ver);
			log.warning("-> Check Thread To Update.");
			in.close();
			return true;
		} catch (IOException e) {
			log("-> Error: Version File Not Found..");
		}
		return false;
	}	
	
	@SuppressWarnings("all")
	public class kk extends JDialog {
		public kk() {
			initComponents();
		}

		private void initComponents() {
			panel12 = new JPanel();
			panel8 = new JPanel();
			speed = new JSlider();
			four2 = new JLabel();
			label8 = new JLabel();
			label9 = new JLabel();
			label10 = new JLabel();
			label11 = new JLabel();
			label3 = new JLabel();
			traps = new JCheckBox();
			banking = new JCheckBox();
			Start = new JButton();
			control = new JCheckBox();
			food = new JCheckBox();
			location = new JComboBox();
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			setTitle("Protoliz");
			setResizable(false);
			setIconImage(null);
			setBackground(Color.white);
			setAlwaysOnTop(true);
			Container contentPane = getContentPane();
			contentPane.setLayout(null);
			{
				panel12.setBackground(Color.black);
				panel12.setBorder(new CompoundBorder(new TitledBorder(""),
						new EmptyBorder(5, 5, 5, 5)));
				panel12.setLayout(null);
				{
					panel8.setBackground(new Color(240, 240, 240, 0));
					panel8.setBorder(new CompoundBorder(new TitledBorder(""),
							new EmptyBorder(5, 5, 5, 5)));
					panel8.setForeground(Color.cyan);
					panel8.setLayout(null);
					speed.setValue(6);
					speed.setMaximum(8);
					speed.setForeground(Color.white);
					speed.setSnapToTicks(true);
					speed.setBackground(Color.black);
					speed.setMinimum(4);
					panel8.add(speed);
					speed.setBounds(5, 25, 110, 20);
					four2.setText("4");
					four2.setForeground(Color.cyan);
					panel8.add(four2);
					four2.setBounds(new Rectangle(new Point(10, 45), four2
							.getPreferredSize()));
					label8.setText("5");
					label8.setForeground(Color.cyan);
					panel8.add(label8);
					label8.setBounds(new Rectangle(new Point(30, 45), label8
							.getPreferredSize()));
					label9.setText("6");
					label9.setForeground(Color.cyan);
					panel8.add(label9);
					label9.setBounds(new Rectangle(new Point(55, 45), label9
							.getPreferredSize()));
					label10.setText("7");
					label10.setForeground(Color.cyan);
					panel8.add(label10);
					label10.setBounds(new Rectangle(new Point(80, 45), label10
							.getPreferredSize()));
					label11.setText("8");
					label11.setForeground(Color.cyan);
					panel8.add(label11);
					label11.setBounds(new Rectangle(new Point(105, 45), label11
							.getPreferredSize()));
					label3.setText("Mouse Speed");
					label3.setHorizontalAlignment(SwingConstants.CENTER);
					label3.setForeground(Color.cyan);
					panel8.add(label3);
					label3.setBounds(10, 10, 105, 15);
					{
						Dimension preferredSize = new Dimension();
						for (int i = 0; i < panel8.getComponentCount(); i++) {
							Rectangle bounds = panel8.getComponent(i)
									.getBounds();
							preferredSize.width = Math.max(bounds.x
									+ bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y
									+ bounds.height, preferredSize.height);
						}
						Insets insets = panel8.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						panel8.setMinimumSize(preferredSize);
						panel8.setPreferredSize(preferredSize);
					}
				}
				panel12.add(panel8);
				panel8.setBounds(10, 115, 120, 65);
				traps.setText("Three Traps?");
				traps.setBackground(Color.black);
				traps.setForeground(Color.cyan);
				traps.setHorizontalAlignment(SwingConstants.LEFT);
				panel12.add(traps);
				traps.setBounds(5, 25, 120, traps.getPreferredSize().height);
				banking.setText("Bank Lizards?");
				banking.setSelected(true);
				banking.setBackground(Color.black);
				banking.setForeground(Color.cyan);
				banking.setHorizontalAlignment(SwingConstants.LEFT);
				panel12.add(banking);
				banking.setBounds(new Rectangle(new Point(5, 5), banking
						.getPreferredSize()));
				Start.setText("Start");
				Start.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (location.getSelectedIndex() != 0) {
							if (location.getSelectedIndex() == 3
									&& traps.isSelected()) {
								MessageBox("Info", "Sorry 3 Traps Is Not Supported For That Location");
							} else {
								if (food.isSelected()) {
									eat = true;
								}
								started = 1;
								proto.setVisible(false);
								if (traps.isSelected()) {
									three = true;
									trapcount = 3;
								}
								if (control.isSelected()) {
									MessageBox("Feature Disabled.", "This Feature has been removed until it's remade, Thanks l3eta.");
								}
								if (banking.isSelected()) {
									ph = false;
								} else if (!banking.isSelected()) {
									ph = true;
								}

								mouse.setSpeed(proto.speed.getValue());
								if (location.getSelectedIndex() == 1) {
									if (traps.isSelected()) {
										log("Going To Trap Area #1 && Using 3 traps");
										traparea = ta1;
										bankpath = t1b;
										lizardpath = t1l;
										tr = 1;
									} else {
										log("Going To Trap Area #1 && Using 2 traps");
										traparea = ta1t2;
										bankpath = t1b;
										lizardpath = t1l;
										tr = 1;
									}

								} else if (location.getSelectedIndex() == 2) {
									if (traps.isSelected()) {
										log("Going To Trap Area #2 && Using 3 traps");
										traparea = ta2;
										bankpath = t2b;
										lizardpath = t2l;
										tr = 2;
									} else {
										log("Going To Trap Area #2 && Using 2 traps");
										traparea = ta2t2;
										bankpath = t2b;
										lizardpath = t2l;
										tr = 2;
									}
								} else if (location.getSelectedIndex() == 3) {
									log("Going To Trap Area #3");
									traparea = ta3;
									bankpath = t3b;
									lizardpath = t3l;
									tr = 3;
								}
							}
						} else {
							MessageBox("Info", "Select A Location.");
						}
					}
				});
				panel12.add(Start);
				Start.setBounds(10, 185, 120, 20);
				control.setText("Script Control Panel?");
				control.setBackground(Color.black);
				control.setForeground(Color.cyan);
				control.setHorizontalAlignment(SwingConstants.LEFT);
				panel12.add(control);
				control.setBounds(5, 65, 125, control.getPreferredSize().height);
				food.setText("Food Support?");
				food.setBackground(Color.black);
				food.setForeground(Color.cyan);
				food.setHorizontalAlignment(SwingConstants.LEFT);
				panel12.add(food);
				food.setBounds(5, 45, 120, food.getPreferredSize().height);
				location.setModel(new DefaultComboBoxModel(new String[] {
						"Select Location", "Trap Spot 1", "Trap Spot 2",
						"Trap Spot 3" }));
				panel12.add(location);
				location.setBounds(10, 90, 120,
						location.getPreferredSize().height);
				{
					Dimension preferredSize = new Dimension();
					for (int i = 0; i < panel12.getComponentCount(); i++) {
						Rectangle bounds = panel12.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width,
								preferredSize.width);
						preferredSize.height = Math.max(bounds.y
								+ bounds.height, preferredSize.height);
					}
					Insets insets = panel12.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel12.setMinimumSize(preferredSize);
					panel12.setPreferredSize(preferredSize);
				}
			}
			contentPane.add(panel12);
			panel12.setBounds(0, 0, 140, 215);
			{
				Dimension preferredSize = new Dimension();
				for (int i = 0; i < contentPane.getComponentCount(); i++) {
					Rectangle bounds = contentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width,
							preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height,
							preferredSize.height);
				}
				Insets insets = contentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				contentPane.setMinimumSize(preferredSize);
				contentPane.setPreferredSize(preferredSize);
			}
			pack();
			setLocationRelativeTo(getOwner());
		}

		private JPanel panel12;
		private JPanel panel8;
		private JSlider speed;
		private JLabel four2;
		private JLabel label8;
		private JLabel label9;
		private JLabel label10;
		private JLabel label11;
		private JLabel label3;
		private JCheckBox traps;
		private JCheckBox banking;
		private JButton Start;
		private JCheckBox control;
		private JCheckBox food;
		
		private JComboBox location;
	}

	public void MessageBox(String title, String text) {
		message.setTitle(title);
		message.MessageText.setText(text);
		message.setVisible(true);
	}

	public void openURL(final String url) {
		final String osName = System.getProperty("os.name");
		try {
			if (osName.startsWith("Mac OS")) {
				final Class<?> fileMgr = Class
						.forName("com.apple.eio.FileManager");
				final Method openURL = fileMgr.getDeclaredMethod("openURL",
						new Class[] { String.class });
				openURL.invoke(null, new Object[] { url });
			} else if (osName.startsWith("Windows")) {
				Runtime.getRuntime().exec(
						"rundll32 url.dll,FileProtocolHandler " + url);
			} else {
				final String[] browsers = { "firefox", "opera", "konqueror",
						"epiphany", "mozilla", "netscape", "chrome" };
				String browser = null;
				for (int count = 0; count < browsers.length && browser == null; count++) {
					if (Runtime.getRuntime()
							.exec(new String[] { "which", browsers[count] })
							.waitFor() == 0) {
						browser = browsers[count];
					}
				}
				if (browser == null) {
					throw new Exception("Could not find web browser");
				} else {
					Runtime.getRuntime().exec(new String[] { browser, url });
				}
			}
		} catch (final Exception e) {
		}
	}

	public void cab() {
		int abr;
		abr = random(0, 10);
		switch (abr) {
		case 1:
			camera.moveRandomly(random(20, 100));
			break;
		case 3:
			if (camera.getPitch() >= 2060) {
				camera.setPitch(camera.getPitch() - random(25, 50));
			}
			break;
		case 5:
			camera.setPitch(camera.getPitch() + random(25, 75));
			break;
		case 7:
			camera.setAngle(camera.getAngle() + random(25, 75));
			break;
		case 9:
			camera.setAngle(camera.getAngle() - random(25, 75));
			break;
		}
	}

	public void ab() {
		int abr;
		abr = random(0, 30);
		switch (abr) {
		case 6:
			mouse.moveRandomly(random(10, 250));
			break;
		case 12:
			mouse.moveOffScreen();
			sleep(1000);
			break;
		case 18:
			mouse.moveRandomly(random(50, 200));
			break;
		case 24:
			camera.setAngle(camera.getAngle() + random(25, 75));
			break;
		case 30:
			camera.setAngle(camera.getAngle() - random(25, 75));
			break;
		}
	}

	public Image getImage(String image, File file) {
		try {
			BufferedImage img = ImageIO.read(new URL(
					"http://l3eta.com/scripts/protoliz/images/" + image));
			if (img != null) {
				ImageIO.write((RenderedImage) img, "PNG", file);
				return img;
			}
		} catch (IOException e) {
		}
		return null;
	}

	@SuppressWarnings("serial")
	public class dialog extends JFrame {
		public dialog() {
			initComponents();
		}

		private void clicked(ActionEvent e) {
			this.dispose();
		}

		private void initComponents() {
			panel1 = new JPanel();
			button1 = new JButton();
			panel2 = new JPanel();
			MessageText = new JLabel();
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			Container contentPane = getContentPane();
			contentPane.setLayout(null);
			{
				panel1.setBackground(Color.black);
				panel1.setLayout(null);
				button1.setText("Close");
				button1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						clicked(e);
					}
				});
				panel1.add(button1);
				button1.setBounds(5, 60, 340, button1.getPreferredSize().height);
				{
					panel2.setLayout(null);
					MessageText.setText("Message");
					MessageText.setVerticalAlignment(SwingConstants.TOP);
					panel2.add(MessageText);
					MessageText.setBounds(0, 0, 340, 50);
					{
						Dimension preferredSize = new Dimension();
						for (int i = 0; i < panel2.getComponentCount(); i++) {
							Rectangle bounds = panel2.getComponent(i)
									.getBounds();
							preferredSize.width = Math.max(bounds.x
									+ bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y
									+ bounds.height, preferredSize.height);
						}
						Insets insets = panel2.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						panel2.setMinimumSize(preferredSize);
						panel2.setPreferredSize(preferredSize);
					}
				}
				panel1.add(panel2);
				panel2.setBounds(5, 5, 340, 50);
				{
					Dimension preferredSize = new Dimension();
					for (int i = 0; i < panel1.getComponentCount(); i++) {
						Rectangle bounds = panel1.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width,
								preferredSize.width);
						preferredSize.height = Math.max(bounds.y
								+ bounds.height, preferredSize.height);
					}
					Insets insets = panel1.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel1.setMinimumSize(preferredSize);
					panel1.setPreferredSize(preferredSize);
				}
			}
			contentPane.add(panel1);
			panel1.setBounds(0, 0, 350, 90);
			{
				Dimension preferredSize = new Dimension();
				for (int i = 0; i < contentPane.getComponentCount(); i++) {
					Rectangle bounds = contentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width,
							preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height,
							preferredSize.height);
				}
				Insets insets = contentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				contentPane.setMinimumSize(preferredSize);
				contentPane.setPreferredSize(preferredSize);
			}
			pack();
			setLocationRelativeTo(getOwner());
		}

		private JPanel panel1;
		private JButton button1;
		private JPanel panel2;
		private JLabel MessageText;
	}
	
	/**
     * Walks towards the end of a path. This method should be looped.
     *
     * @param path    The path to walk along.
     * @param maxDist See {@link #nextTile(RSTile[], int)}.
     * @param randX   The X value to randomize each tile in the path by.
     * @param randY   The Y value to randomize each tile in the path by.
     * @return <tt>true</tt> if the next tile was reached; otherwise
     *         <tt>false</tt>.
     */
    public boolean walkPathMM(RSTile[] path) {
        try {
            RSTile next = nextTile(path, 17);
            return next != null && walking.walkTileMM(next, 1, 1);
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Returns the next tile to walk to on a path.
     *
     * @param path The path.
     * @return The next <tt>RSTile</tt> to walk to on the provided path;
     *         or <code>null</code> if far from path or at destination.
     * @see #nextTile(RSTile[], int)
     */
    public RSTile nextTile(RSTile path[]) {
        return nextTile(path, 17);
    }

    /**
     * Returns the next tile to walk to in a path.
     *
     * @param path     The path.
     * @param skipDist If the distance to the tile after the
     *                 next in the path is less than or equal to this distance,
     *                 the tile after next will be returned rather than the next
     *                 tile, skipping one. This interlacing aids continuous walking.
     * @return The next <tt>RSTile</tt> to walk to on the provided path;
     *         or <code>null</code> if far from path or at destination.
     */
    public RSTile nextTile(RSTile path[], int skipDist) {
        int dist = 99;
        int closest = -1;
        for (int i = path.length - 1; i >= 0; i--) {
            RSTile tile = path[i];
            int d = calc.distanceTo(tile);
            if (d < dist) {
                dist = d;
                closest = i;
            }
        }

        int feasibleTileIndex = -1;

        for (int i = closest; i < path.length; i++) {

            if (calc.distanceTo(path[i]) <= skipDist)
                feasibleTileIndex = i;
            else
                break;
        }

        if (feasibleTileIndex == -1)
            return null;
        else
            return path[feasibleTileIndex];
    }

    /**
     * Randomizes a path of tiles.
     *
     * @param path          The RSTiles to randomize.
     * @param maxXDeviation Max X distance from tile.getX().
     * @param maxYDeviation Max Y distance from tile.getY().
     * @return The new, randomized path.
     */
    public RSTile[] randomizePath(RSTile[] path, int maxXDeviation, int maxYDeviation) {
        RSTile[] rez = new RSTile[path.length];
        for (int i = 0; i < path.length; i++) {
            rez[i] = randomizeTile(path[i], maxXDeviation, maxYDeviation);
        }
        return rez;
    }

    /**
     * Randomizes a single tile.
     *
     * @param tile          The RSTile to randomize.
     * @param maxXDeviation Max X distance from tile.getX().
     * @param maxYDeviation Max Y distance from tile.getY().
     * @return The randomized tile.
     */
    Random random = new Random();
    public RSTile randomizeTile(RSTile tile, int maxXDeviation, int maxYDeviation) {
        int x = tile.getX();
        int y = tile.getY();
        if (maxXDeviation > 0) {
            double d = random.nextDouble() * 2;
            d -= 1.0;
            d *= maxXDeviation;
            x += (int) d;
        }
        if (maxYDeviation > 0) {
            double d = random.nextDouble() * 2;
            d -= 1.0;
            d *= maxYDeviation;
            y += (int) d;
        }
        return new RSTile(x, y);
    }

    /**
     * Reverses an array of tiles.
     *
     * @param other The <tt>RSTile</tt> path array to reverse.
     * @return The reverse <tt>RSTile</tt> path for the given <tt>RSTile</tt> path.
     */
    public RSTile[] reversePath(RSTile[] other) {
        RSTile[] t = new RSTile[other.length];
        for (int i = 0; i < t.length; i++) {
            t[i] = other[other.length - i - 1];
        }
        return t;
    }
}