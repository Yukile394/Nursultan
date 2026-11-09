package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class class03508 {
   public static Codec<class03508> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03978.N.lenientOptionalFieldOf("event").forGetter(var0x -> Optional.ofNullable(var0x.L)),
            class03793.N.fieldOf("selector").forGetter(class03508::N),
            class06338.T.fieldOf("event_delay").orElse(0).forGetter(class03508::L)
         )
         .apply(var0, (var0x, var1, var2) -> new class03508((class03978)var0x.orElse(null), var1, var2, true))
   );
   public static final String y = "listener";
   @Nullable
   class03978 L;
   private int i;
   final class03793 u;
   private boolean R;

   public int L() {
      return this.i;
   }

   private class03508(@Nullable class03978 var1, class03793 var2, int var3, boolean var4) {
      super();
      this.L = var1;
      this.i = var3;
      this.u = var2;
      this.R = var4;
   }

   public class03508() {
      this(null, new class03793(), 0, false);
   }

   public boolean i() {
      return this.R;
   }

   public void u() {
      this.i = Math.max(0, this.i - 1);
   }

   @Nullable
   public class03978 y() {
      return this.L;
   }

   public void N(@Nullable class03978 var1) {
      this.L = var1;
   }

   public void N(boolean var1) {
      this.R = var1;
   }

   public class03793 N() {
      return this.u;
   }

   public void N(int var1) {
      this.i = var1;
   }
}
