package minecraft;

import java.nio.file.Path;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class01093 extends class02980 {
   private static final class01612 N = new class01612(class00392.L("dataPack.vanilla.description"), class07529.y().method_70592(class01603.field_14190).N());
   private static final class02974 i = new class02974(class03794.B);
   private static final class02955 R = class02955.N(class01612.y, N, class02974.N, i);
   private static final class02267 M = new class02267("vanilla", class00392.L("dataPack.vanilla.name"), class01283.L, Optional.of(u));
   private static final class02268 B = new class02268(false, class01090.field_14281, false);
   private static final class02268 Z = new class02268(false, class01090.field_14280, false);
   private static final class01894 z = class01894.y("datapacks");

   public class01093(class04173 var1) {
      super(class01603.field_14190, N(), z, var1);
   }

   public static class01623 y() {
      return new class01623(new class01093(new class04173(var0 -> true)));
   }

   public static class01623 N(Path var0, class04173 var1) {
      return new class01623(new class01093(var1), new class01626(var0, class01603.field_14190, class01283.i, var1));
   }

   public static class01623 N(class04785 var0) {
      return N(var0.N(class05071.z), var0.u().i());
   }

   @Nullable
   @Override
   protected class01055 N(String var1, class01061 var2, class00392 var3) {
      return class01055.N(N(var1, var3), var2, class01603.field_14190, Z);
   }

   public static class01611 N() {
      return new class02997().N(R).N("minecraft").y().N().N(M);
   }

   @Override
   protected class00392 N(String var1) {
      return class00392.y(var1);
   }

   @Nullable
   @Override
   protected class01055 N(class01622 var1) {
      return class01055.N(M, y(var1), class01603.field_14190, B);
   }

   private static class02267 N(String var0, class00392 var1) {
      return new class02267(var0, var1, class01283.u, Optional.of(class02298.N(var0)));
   }
}
