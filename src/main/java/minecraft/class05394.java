package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class class05394 implements class05399 {
   private final class00891 N;
   private final List<class05425> y = new ArrayList<>();

   private class05394(class00891 var1) {
      super();
      this.N = var1;
   }

   @Override
   public class04127 y() {
      return new class04127(Optional.empty(), Optional.of(new class04125(this.y.stream().map(class05425::N).toList())));
   }

   private void N(class01975 var1) {
      var1.N(this.N.E());
   }

   public class05394 N(class08437 var1, class03264 var2) {
      return this.N(var1.N(), var2);
   }

   public class05394 N(class01975 var1, class03264 var2) {
      this.N(var1);
      this.y.add(new class05425(Optional.of(var1), var2));
      return this;
   }

   @Override
   public class00891 N() {
      return this.N;
   }

   public class05394 N(class03264 var1) {
      this.y.add(new class05425(Optional.empty(), var1));
      return this;
   }

   public static class05394 N(class00891 var0) {
      return new class05394(var0);
   }
}
