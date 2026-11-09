package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.Function;

public record class04475(String translationKey, List<class04440> parameters, class00405 style) {
   public static Object u_0 = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.STRING.fieldOf("translation_key").forGetter(class04475::y),
            ((Codec)class04440.staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_4).listOf().fieldOf("parameters").forGetter(class04475::L),
            class00411.y.optionalFieldOf("style", class00405.N).forGetter(class04475::N)
         )
         .apply(var0, class04475::new)
   );
   public static Object u_1;

   public static class04475 L(String var0) {
      return new class04475(var0, List.of(class04440.TARGET, class04440.SENDER, class04440.CONTENT), class00405.N);
   }

   public List<class04440> L() {
      return this.parameters;
   }

   public class04475(String translationKey, List<class04440> parameters, class00405 style) {
      this.translationKey = translationKey;
      this.parameters = parameters;
      this.style = style;
   }

   static {
      B();
      Function function = class04475::y;
      class02362 class02362 = class04440.staticFields_0ec9e67d4a0683ab6bd6627d9711a269e_5.N_33(class02389.N());
      Function function1 = class04475::L;
      Function function2 = class04475::N;
      u_1 = class02362.N(class02389.s, function, class02362, function1, class00411.L, function2, class04475::new);
   }

   private static void B() {
      u_0 = null;
      u_1 = null;
   }

   public static class04475 u(String var0) {
      class00405 class00405 = class00405.N.N(class06541.field_1080).y(true);
      return new class04475(var0, List.of(class04440.TARGET, class04440.CONTENT), class00405);
   }

   public String y() {
      return this.translationKey;
   }

   private class00392[] y(class00392 var1, class00649 var2) {
      class00392[] aclass00392 = new class00392[this.parameters.size()];

      for (int i = 0; i < aclass00392.length; i++) {
         class04440 class04440 = this.parameters.get(i);
         aclass00392[i] = class04440.N(var1, var2);
      }

      return aclass00392;
   }

   public static class04475 y(String var0) {
      return new class04475(var0, List.of(class04440.SENDER, class04440.CONTENT), class00405.N);
   }

   public class00392 N(class00392 var1, class00649 var2) {
      class00392[] aclass00392 = this.y(var1, var2);
      return class00392.N(this.translationKey, aclass00392).L(this.style);
   }

   public static class04475 N(String var0) {
      class00405 class00405 = class00405.N.N(class06541.field_1080).y(true);
      return new class04475(var0, List.of(class04440.SENDER, class04440.CONTENT), class00405);
   }

   public class00405 N() {
      return this.style;
   }
}
