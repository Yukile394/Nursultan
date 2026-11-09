package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public interface class05081 {
   int u = 19133;
   int i = 19132;

   boolean w();

   default class03767 K() {
      return this.Q().y();
   }

   boolean T();

   class03776 Q();

   Set<String> I();

   Set<String> J();

   class07086 s();

   class05934 l();

   boolean d();

   class07305 m();

   class05212 o();

   Lifecycle k();

   @Nullable
   class07001 t();

   boolean g();

   class07312 q();

   boolean U();

   class07282 z();

   void u(boolean var1);

   String u();

   boolean E();

   void N(class07282 var1);

   void N(String var1, boolean var2);

   class07001 N(class01042 var1, @Nullable class07001 var2);

   void N(@Nullable class07001 var1);

   void N(class03776 var1);

   void N(class07086 var1);

   default void N(class07074 var1) {
      var1.N("Known server brands", () -> String.join(", ", this.I()));
      var1.N("Removed feature flags", () -> String.join(", ", this.J()));
      var1.N("Level was modded", () -> Boolean.toString(this.g()));
      var1.N("Level storage version", () -> {
         int ix = this.G();
         return String.format(Locale.ROOT, "0x%05X - %s", ix, this.R(ix));
      });
   }

   void N(class07826 var1);

   default String R(int var1) {
      switch (var1) {
         case 19132:
            return "McRegion";
         case 19133:
            return "Anvil";
         default:
            return "Unknown?";
      }
   }

   @Nullable
   class07001 O();

   int G();

   class07826 Y();
}
