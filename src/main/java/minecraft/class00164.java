package minecraft;

public record class00164(String id, int argCount) {
   public class00164(String id, int argCount) {
      this.id = id;
      this.argCount = argCount;
   }

   @Override
   public String toString() {
      return this.id + "/" + this.argCount;
   }

   public int y() {
      return this.argCount;
   }

   public String N() {
      return this.id;
   }
}
