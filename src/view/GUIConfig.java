package view;

/**
 * @author ice1000
 *         Created by ice1000 on 2016/7/24.
 */
public class GUIConfig {

	public static final String VERSION = "V0.0.2 Alpha";

	public static final String BUILD="0001";

	//TODO 发布前记得改DEBUG常量！！
	public static final boolean DEBUG = false;

	public static final String GUI_FORM_TITLE = "城堡游戏   by 冰封 and Eldath" + " " + VERSION;

	public static final float FONT_SIZE = 13f;

	public static final boolean RESIZABLE = true;

	public static int MODEL = MODEL_VALUE.UNKNOWN;

	public static class MODEL_VALUE {
		public static final int UNKNOWN = 0x00;
		public static final int GUI = 0x01;
		public static final int CUI = 0x02;
	}

	public static final int FRAME_WIDTH = 640;
	public static final int FRAME_HEIGHT = 640;
	//public static final int INPUT_WIDTH = 640;

	//public static final String HINT = "在这里输入指令";

}
