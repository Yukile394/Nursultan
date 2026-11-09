package minecraft;

public record class07821(int protocolVersion, String hostName, int port, class04193 intention) implements class00381<class07825> {
   public static final class02362<class00667, class07821> N = class00381.N(class07821::N, class07821::new);
   private static final int R = 255;

   public int L() {
      return this.port;
   }

   @Deprecated
   public class07821(int protocolVersion, String hostName, int port, class04193 intention) {
      this.protocolVersion = protocolVersion;
      this.hostName = hostName;
      this.port = port;
      this.intention = intention;
   }

   private class07821(class00667 var1) {
      this(var1.E(), var1.u(255), var1.readUnsignedShort(), class04193.N(var1.E()));
   }

   public class04193 u() {
      return this.intention;
   }

   public String y() {
      return this.hostName;
   }

   private void N(class00667 var1) {
      var1.L(this.protocolVersion);
      var1.N(this.hostName);
      var1.writeShort(this.port);
      var1.L(this.intention.N());
   }

   public void method_65081(class07825 var1) {
      var1.N(this);
   }

   public int N() {
      return this.protocolVersion;
   }

   @Override
   public boolean R() {
      return true;
   }

   @Override
   public class02897<class07821> method_65080() {
      return class04286.N;
   }
}
