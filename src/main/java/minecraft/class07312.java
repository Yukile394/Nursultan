package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import org.slf4j.Logger;

public final class class07312 {
   private static final Logger N = LogUtils.getLogger();
   private final String y;
   private final class07282 L;
   private final boolean u;
   private final class07086 i;
   private final boolean R;
   private final class07305 M;
   private final class03776 B;

   public boolean L() {
      return this.u;
   }

   public class03776 M() {
      return this.B;
   }

   public class07312(String var1, class07282 var2, boolean var3, class07086 var4, boolean var5, class07305 var6, class03776 var7) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.M = var6;
      this.B = var7;
   }

   public class07312 B() {
      return new class07312(this.y, this.L, this.u, this.i, this.R, this.M.y(this.B.y()), this.B);
   }

   public boolean i() {
      return this.R;
   }

   public class07086 u() {
      return this.i;
   }

   public class07282 y() {
      return this.L;
   }

   public class07312 N(class03776 var1) {
      return new class07312(this.y, this.L, this.u, this.i, this.R, this.M, var1);
   }

   public class07312 N(class07086 var1) {
      return new class07312(this.y, this.L, this.u, var1, this.R, this.M, this.B);
   }

   public String N() {
      return this.y;
   }

   public static class07312 N(Dynamic<?> var0, class03776 var1) {
      class07282 class07282 = class07282.N(var0.get("GameType").asInt(0));
      return new class07312(
         var0.get("LevelName").asString(""),
         class07282,
         var0.get("hardcore").asBoolean(false),
         var0.get("Difficulty").asNumber().map(var0x -> class07086.N(var0x.byteValue())).result().orElse(class07086.field_5802),
         var0.get("allowCommands").asBoolean(class07282 == class07282.field_9220),
         (class07305)class07305.N(var1.y()).parse(var0.get("game_rules").orElseEmptyMap()).resultOrPartial(N::warn).orElseThrow(),
         var1
      );
   }

   public class07312 N(class07282 var1) {
      return new class07312(this.y, var1, this.u, this.i, this.R, this.M, this.B);
   }

   public class07305 R() {
      return this.M;
   }
}
