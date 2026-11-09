package minecraft;

public record class01282(String serverAddress) implements class01276 {
   public class01282(String serverAddress) {
      this.serverAddress = serverAddress;
   }

   public String y() {
      return this.serverAddress;
   }

   @Override
   public boolean N() {
      return !class05018.B(this.serverAddress);
   }
}
