package minecraft;

public record class03681(class00392 text, int lineWidth, class03692 textOpacity, class03692 backgroundColor, byte flags) {

   public class03692 L() {
      return this.textOpacity;
   }

   public class03681(class00392 text, int lineWidth, class03692 textOpacity, class03692 backgroundColor, byte flags) {
      this.text = text;
      this.lineWidth = lineWidth;
      this.textOpacity = textOpacity;
      this.backgroundColor = backgroundColor;
      this.flags = flags;
   }

   public byte i() {
      return this.flags;
   }

   public class03692 u() {
      return this.backgroundColor;
   }

   public int y() {
      return this.lineWidth;
   }

   public class00392 N() {
      return this.text;
   }
}
