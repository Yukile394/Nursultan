package minecraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class08581 implements class07135 {
   private static final class01894 N = class01894.y("trims/color_palettes/trim_palette");
   private static final Map<String, class01894> i = y().collect(Collectors.toMap(class08569::N, var0 -> class01894.y("trims/color_palettes/" + var0.N())));
   private static final List<class05946<class03246>> R = List.of(
      class03247.N,
      class03247.y,
      class03247.L,
      class03247.u,
      class03247.i,
      class03247.R,
      class03247.M,
      class03247.B,
      class03247.Z,
      class03247.z,
      class03247.U,
      class03247.E,
      class03247.W,
      class03247.m,
      class03247.P,
      class03247.s,
      class03247.T,
      class03247.b
   );
   private static final List<class08719> M = List.of(class08719.field_54125, class08719.field_54126);
   private final class01997 B;

   private static List<class04233> L() {
      return List.of(new class03266(N(), N, i));
   }

   private static List<class04233> M() {
      return List.of(N(class08874.Z), N(class08874.z), N(class05911.T));
   }

   public class08581(class01996 var1) {
      super();
      this.B = var1.method_45973(class02024.field_39368, "atlases");
   }

   private static List<class04233> B() {
      return List.of(new class04221("gui/sprites", ""), new class04221("mob_effect", "mob_effect/"));
   }

   private static List<class04233> i() {
      return List.of(N(class05911.W), new class03266(List.of(class05422.N, class05422.y, class05422.L, class05422.u), N, i));
   }

   private static List<class04233> u() {
      return List.of(N(class05911.m), N(class03362.N), N(class06245.N), N(class03369.N));
   }

   private static List<class04233> y(class08571 var0) {
      return List.of(N(var0));
   }

   private static Stream<class08569> y() {
      return class05422.i
         .stream()
         .map(class05414::N)
         .flatMap(var0 -> Stream.concat(Stream.of(var0.N()), var0.y().values().stream()))
         .sorted(Comparator.comparing(class08569::N));
   }

   private CompletableFuture<?> N(class04476 var1, class01894 var2, List<class04233> var3) {
      return class07135.N(var1, class04223.y, var3, this.B.N(var2));
   }

   private static class04233 N(class08571 var0) {
      return new class04221(var0.y(), var0.y() + "/");
   }

   private static class04233 N(class05913 var0) {
      return new class04216(var0.y());
   }

   private static List<class04233> N(String var0) {
      return List.of(new class04221(var0, ""));
   }

   private static List<class01894> N() {
      ArrayList arraylist = new ArrayList(R.size() * M.size());
      Iterator<class05946<class03246>> iterator = R.iterator();

      while (iterator.hasNext()) {
         class01894 class01894 = class03247.N(iterator.next());

         for (class08719 class08719 : M) {
            arraylist.add(class01894.N((UnaryOperator<String>)(var1x -> class08719.N() + "/" + var1x)));
         }
      }

      return arraylist;
   }

   @Override
   public String method_10321() {
      return "Atlas Definitions";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      return CompletableFuture.allOf(
         this.N(var1, class08589.N, L()),
         this.N(var1, class08589.y, R()),
         this.N(var1, class08589.L, y(class05911.v)),
         this.N(var1, class08589.u, u()),
         this.N(var1, class08589.i, i()),
         this.N(var1, class08589.R, y(class05911.b)),
         this.N(var1, class08589.M, y(class05911.j)),
         this.N(var1, class08589.B, B()),
         this.N(var1, class08589.Z, N("map/decorations")),
         this.N(var1, class08589.z, N("painting")),
         this.N(var1, class08589.U, N("particle")),
         this.N(var1, class08589.E, M()),
         this.N(var1, class08589.W, y(class05911.n)),
         this.N(var1, class08589.m, y(class05911.t)),
         this.N(var1, class08589.P, N("environment/celestial"))
      );
   }

   private static List<class04233> R() {
      return List.of(N(class08874.B), N(class05911.s));
   }
}
