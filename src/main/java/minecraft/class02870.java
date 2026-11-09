package minecraft;

public record class02870(String host, int port) implements class00381<class01662> {
   public static final class02362<class00667, class02870> N = class00381.N(class02870::N, class02870::new);

   private class02870(class00667 var1) {
      this(var1.s(), var1.E());
   }

   public class02870(String host, int port) {
      super();
      this.host = host;
      this.port = port;
   }

   public int y() {
      return this.port;
   }

   private void N(class00667 var1) {
      var1.N(this.host);
      var1.L(this.port);
   }

   public String N() {
      return this.host;
   }

   public void method_65081(class01662 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class02870> method_65080() {
      return class02885.E;
   }
}
