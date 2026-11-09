package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class06083 implements class01285 {
   public class06083() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class07049 class07049 = class06202.Nq().F();
      class04782 class04782 = var2 instanceof class04782 ? (class04782)var2 : null;
      if (class07049 != null && class04782 != null) {
         class00760 class00760 = class04782.method_14178().b();
         if (class00760 != null) {
            Object2IntMap<class07428> object2intmap = class00760.y();
            int i = class00760.N();
            var1.y(
               "SC: "
                  + i
                  + ", "
                  + Stream.of(class07428.values())
                     .map(var1x -> Character.toUpperCase(var1x.N().charAt(0)) + ": " + object2intmap.getInt(var1x))
                     .collect(Collectors.joining(", "))
            );
         }
      }
   }
}
