package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class class03982 {
   public static final Codec<class03982> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.T.fieldOf("ticks_since_last_warning").orElse(0).forGetter(var0x -> var0x.M),
            class06338.T.fieldOf("warning_level").orElse(0).forGetter(var0x -> var0x.B),
            class06338.T.fieldOf("cooldown_ticks").orElse(0).forGetter(var0x -> var0x.Z)
         )
         .apply(var0, class03982::new)
   );
   public static final int y = 4;
   private static final double L = 16.0;
   private static final int u = 48;
   private static final int i = 12000;
   private static final int R = 200;
   private int M;
   private int B;
   private int Z;

   public int L() {
      return this.B;
   }

   public class03982(int var1, int var2, int var3) {
      super();
      this.M = var1;
      this.B = var2;
      this.Z = var3;
   }

   public class03982() {
      this(0, 0, 0);
   }

   private void i() {
      if (!this.u()) {
         this.M = 0;
         this.Z = 200;
         this.N(this.L() + 1);
      }
   }

   private boolean u() {
      return this.Z > 0;
   }

   public void y() {
      this.M = 0;
      this.B = 0;
      this.Z = 0;
   }

   private static List<class04770> y(class04782 var0, class07209 var1) {
      class06889 class06889 = class06889.y(var1);
      return var0.method_18766(var1x -> !var1x.method_7325() && var1x.method_73189().N((class00737)class06889, 16.0) && var1x.method_5805());
   }

   private static boolean N(class04782 var0, class07209 var1) {
      class00734 class00734 = class00734.N(class06889.y(var1), 48.0, 48.0, 48.0);
      return !var0.N(class04003.class, class00734).isEmpty();
   }

   public static OptionalInt N(class04782 var0, class07209 var1, class04770 var2) {
      if (N(var0, var1)) {
         return OptionalInt.empty();
      } else {
         List<class04770> list = y(var0, var1);
         if (!list.contains(var2)) {
            list.add(var2);
         }

         if (list.stream().anyMatch(var0x -> var0x.method_42272().map(class03982::u).orElse(false))) {
            return OptionalInt.empty();
         } else {
            Optional optional = list.stream().flatMap(var0x -> var0x.method_42272().stream()).max(Comparator.comparingInt(class03982::L));
            if (optional.isPresent()) {
               class03982 class03982 = (class03982)optional.get();
               class03982.i();
               list.forEach(var1x -> var1x.method_42272().ifPresent(var1xx -> var1xx.N(class03982)));
               return OptionalInt.of(class03982.B);
            } else {
               return OptionalInt.empty();
            }
         }
      }
   }

   public void N() {
      if (this.M >= 12000) {
         this.R();
         this.M = 0;
      } else {
         this.M++;
      }

      if (this.Z > 0) {
         this.Z--;
      }
   }

   private void N(class03982 var1) {
      this.B = var1.B;
      this.Z = var1.Z;
      this.M = var1.M;
   }

   public void N(int var1) {
      this.B = class04995.N(var1, 0, 4);
   }

   private void R() {
      this.N(this.L() - 1);
   }
}
