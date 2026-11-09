package minecraft;

import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public final class class03409 {
   private static final int N = 1024;
   private final class03414 y;
   private final class03415 L;
   private final class03407 u;
   @Nullable
   private class02065 i;

   public boolean L() {
      return this.i != null;
   }

   public class03409(class03414 var1, class03415 var2, class03407 var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   public class03407 y() {
      return this.u;
   }

   public void N(@Nullable class02065 var1) {
      this.i = var1;
   }

   public boolean N(UUID var1) {
      return this.L() && this.i.N(var1);
   }

   public static class03409 N(class03415 var0, UserApiService var1) {
      class03407 class03407 = new class03407(1024);
      class03414 class03414 = class03414.N(var0, var1);
      return new class03409(class03414, var0, class03407);
   }

   public void N(class06202 var1, class05096 var2, Runnable var3, boolean var4) {
      if (this.i != null) {
         class02065 class02065 = this.i.y();
         var1.N(
            new class05733(
               var5x -> {
                  this.N(null);
                  if (var5x) {
                     var1.N(class02065.N(var2, this));
                  } else {
                     var3.run();
                  }
               },
               class00392.L(var4 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               class00392.L(var4 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               class00392.L("gui.abuseReport.draft.edit"),
               class00392.L("gui.abuseReport.draft.discard")
            )
         );
      } else {
         var3.run();
      }
   }

   public class03414 N() {
      return this.y;
   }

   public boolean N(class03415 var1) {
      return Objects.equals(this.L, var1);
   }
}
