
public class Box {
		private int height;
		private int width;
		private int depth;
		
		public Box(int height, int width, int depth) {
			
			this.height = height;
			this.width = width;
			this.depth = depth;
			
		}
		
		public void display() {
			System.out.println("Height - "+ height + " Width - "+  width + " Depth - "+ depth);
		}
		
		public void volume() {
			int vol = this.height * this.width * this.depth;
			System.out.println("Volume : " + vol);
		}
}
