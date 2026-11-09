package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03117 extends class05096 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 25;
   private static final class00392 L = class00392.L("recover_world.title").N(class06541.field_1067);
   private static final class00392 u = class00392.L("recover_world.bug_tracker");
   private static final class00392 i = class00392.L("recover_world.restore");
   private static final class00392 R = class00392.L("recover_world.no_fallback");
   private static final class00392 M = class00392.L("recover_world.done.title");
   private static final class00392 B = class00392.L("recover_world.done.success");
   private static final class00392 Z = class00392.L("recover_world.done.failed");
   private static final class00392 z = class00392.L("recover_world.issue.none").N(class06541.field_1060);
   private static final class00392 U = class00392.L("recover_world.issue.missing_file").N(class06541.field_1061);
   private final BooleanConsumer E;
   private final class01885 W = class01885.u().N(8);
   private final class00392 m;
   private final class04230 P;
   private final class04230 s;
   private final class04785 T;

   public class03117(class06202 var1, BooleanConsumer var2, class04785 var3) {
      super(L);
      this.E = var2;
      this.m = class00392.N("recover_world.message", class00392.y(var3.R()).N(class06541.field_1080));
      this.P = new class04230(this.m, (class01590)var1.i_3);
      this.T = var3;
      Exception exception = this.N(var3, false);
      Exception exception1 = this.N(var3, true);
      class05216 class05216 = class00392.i().y(this.N(var3, false, exception)).i("\n").y(this.N(var3, true, exception1));
      this.s = new class04230(class05216, (class01590)var1.i_3);
      boolean flag = exception != null && exception1 == null;
      this.W.L().y();
      this.W.N(new class02071(this.field_22785, (class01590)var1.i_3));
      this.W.N(this.P.N(true));
      this.W.N(this.s);
      class01885 class01885 = class01885.i().N(5);
      class01885.N(class05362.method_46430(u, class01321.y(this, class03597.z)).y(120, 20).N());
      class01885.N(class05362.method_46430(i, var2x -> this.N(var1)).y(120, 20).N(flag ? null : class04141.N(R)).N()).field_22763 = flag;
      this.W.N(class01885);
      this.W.N(class05362.method_46430(class05220.U, var1x -> this.method_25419()).y(120, 20).N());
      this.W.method_48206(this::method_37063);
   }

   private void N(class06202 var1) {
      Exception exception = this.N(this.T, false);
      Exception exception1 = this.N(this.T, true);
      if (exception != null && exception1 == null) {
         var1.y(new class06307(class00392.L("recover_world.restoring")));
         class05227.N(this.T);
         if (this.T.m()) {
            var1.N(new class05733(this.E, M, B, class05220.z, class05220.U));
         } else {
            var1.N(new class01304(() -> this.E.accept(false), M, Z));
         }
      } else {
         N.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            exception != null ? exception.getMessage() : "no issues",
            exception1 != null ? exception1.getMessage() : "no issues"
         );
         var1.N(new class01304(() -> this.E.accept(false), M, Z));
      }
   }

   private class00392 N(class04785 var1, boolean var2, @Nullable Exception var3) {
      if (var2 && var3 instanceof FileNotFoundException) {
         return class00392.i();
      } else {
         class05216 class05216x = class00392.i();
         Instant instant = var1.N(var2);
         class05216 class05216x = instant != null
            ? class00392.y(class05231.N.format(ZonedDateTime.ofInstant(instant, ZoneId.systemDefault())))
            : class00392.L("recover_world.state_entry.unknown");
         class05216x.y(class00392.N("recover_world.state_entry", class05216x.N(class06541.field_1080)));
         if (var3 == null) {
            class05216x.y(z);
         } else if (var3 instanceof FileNotFoundException) {
            class05216x.y(U);
         } else if (var3 instanceof class03103) {
            class05216x.y(class00392.y(var3.getCause().toString()).N(class06541.field_1061));
         } else {
            class05216x.y(class00392.y(var3.toString()).N(class06541.field_1061));
         }

         return class05216x;
      }
   }

   @Nullable
   private Exception N(class04785 var1, boolean var2) {
      try {
         if (!var2) {
            var1.N(var1.B());
         } else {
            var1.N(var1.Z());
         }

         return null;
      } catch (class03142 | class03103 | IOException ioexception) {
         return ioexception;
      }
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.s.N(this.field_22789 - 50);
      this.P.N(this.field_22789 - 50);
      this.W.N();
      class02077.N(this.W, this.method_48202());
   }

   @Override
   public void method_25419() {
      this.E.accept(false);
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(super.method_25435(), this.m);
   }
}
