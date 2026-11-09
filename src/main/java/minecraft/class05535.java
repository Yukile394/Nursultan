package minecraft;

public record class05535(int color, String text, long removeAtTime) {

   public long L() {
      return this.removeAtTime;
   }

   public class05535(int color, String text, long removeAtTime) {
      this.color = color;
      this.text = text;
      this.removeAtTime = removeAtTime;
   }

   public String y() {
      return this.text;
   }

   public int N() {
      return this.color;
   }
}
