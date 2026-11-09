package minecraft;

public record class07341(int location, int samplerIndex) implements class07345 {
   public class07341(int location, int samplerIndex) {
      super();
      this.location = location;
      this.samplerIndex = samplerIndex;
   }

   public int y() {
      return this.samplerIndex;
   }

   public int N() {
      return this.location;
   }
}
