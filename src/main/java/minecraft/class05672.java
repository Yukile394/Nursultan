package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public record class05672(
   class00392 name,
   Predicate<class03556<class05369>> heldJobSite,
   Predicate<class03556<class05369>> acquirableJobSite,
   ImmutableSet<class06581> requestedItems,
   ImmutableSet<class00891> secondaryPoi,
   class04891 workSound
) {
   public static final Predicate<class03556<class05369>> N = var0 -> var0.N(class03949.N);
   public static final class05946<class05672> y = N("none");
   public static final class05946<class05672> L = N("armorer");
   public static final class05946<class05672> u = N("butcher");
   public static final class05946<class05672> i = N("cartographer");
   public static final class05946<class05672> R = N("cleric");
   public static final class05946<class05672> M = N("farmer");
   public static final class05946<class05672> B = N("fisherman");
   public static final class05946<class05672> Z = N("fletcher");
   public static final class05946<class05672> z = N("leatherworker");
   public static final class05946<class05672> U = N("librarian");
   public static final class05946<class05672> E = N("mason");
   public static final class05946<class05672> W = N("nitwit");
   public static final class05946<class05672> m = N("shepherd");
   public static final class05946<class05672> P = N("toolsmith");
   public static final class05946<class05672> s = N("weaponsmith");

   public Predicate<class03556<class05369>> L() {
      return this.acquirableJobSite;
   }

   public class05672(
      class00392 name,
      Predicate<class03556<class05369>> heldJobSite,
      Predicate<class03556<class05369>> acquirableJobSite,
      ImmutableSet<class06581> requestedItems,
      ImmutableSet<class00891> secondaryPoi,
      @Nullable class04891 workSound
   ) {
      super();
      this.name = name;
      this.heldJobSite = heldJobSite;
      this.acquirableJobSite = acquirableJobSite;
      this.requestedItems = requestedItems;
      this.secondaryPoi = secondaryPoi;
      this.workSound = workSound;
   }

   public ImmutableSet<class00891> i() {
      return this.secondaryPoi;
   }

   public ImmutableSet<class06581> u() {
      return this.requestedItems;
   }

   public Predicate<class03556<class05369>> y() {
      return this.heldJobSite;
   }

   public static class05672 N(class00751<class05672> var0) {
      N(var0, y, class05369.N, N, null);
      N(var0, L, class03927.N, class04909.gb);
      N(var0, u, class03927.y, class04909.gj);
      N(var0, i, class03927.L, class04909.gv);
      N(var0, R, class03927.u, class04909.gn);
      N(var0, M, class03927.i, ImmutableSet.of(class06570.bL, class06570.by, class06570.lk, class06570.vQ), ImmutableSet.of(class00869.Lr), class04909.gt);
      N(var0, B, class03927.R, class04909.gG);
      N(var0, Z, class03927.M, class04909.gl);
      N(var0, z, class03927.B, class04909.gd);
      N(var0, U, class03927.Z, class04909.gw);
      N(var0, E, class03927.z, class04909.gk);
      N(var0, W, class05369.N, class05369.N, null);
      N(var0, m, class03927.U, class04909.gY);
      N(var0, P, class03927.E, class04909.gQ);
      return N(var0, s, class03927.W, class04909.gO);
   }

   private static class05946<class05672> N(String var0) {
      return class05946.N(class04227.Ne, class01894.y(var0));
   }

   private static class05672 N(
      class00751<class05672> var0,
      class05946<class05672> var1,
      Predicate<class03556<class05369>> var2,
      Predicate<class03556<class05369>> var3,
      ImmutableSet<class06581> var4,
      ImmutableSet<class00891> var5,
      @Nullable class04891 var6
   ) {
      return class00751.N(var0, var1, new class05672(class00392.L("entity." + var1.N().y() + ".villager." + var1.N().N()), var2, var3, var4, var5, var6));
   }

   private static class05672 N(
      class00751<class05672> var0,
      class05946<class05672> var1,
      class05946<class05369> var2,
      ImmutableSet<class06581> var3,
      ImmutableSet<class00891> var4,
      @Nullable class04891 var5
   ) {
      return N(var0, var1, var1x -> var1x.N(var2), var1x -> var1x.N(var2), var3, var4, var5);
   }

   private static class05672 N(class00751<class05672> var0, class05946<class05672> var1, class05946<class05369> var2, @Nullable class04891 var3) {
      return N(var0, var1, var1x -> var1x.N(var2), var1x -> var1x.N(var2), var3);
   }

   private static class05672 N(
      class00751<class05672> var0,
      class05946<class05672> var1,
      Predicate<class03556<class05369>> var2,
      Predicate<class03556<class05369>> var3,
      @Nullable class04891 var4
   ) {
      return N(var0, var1, var2, var3, ImmutableSet.of(), ImmutableSet.of(), var4);
   }

   public class00392 N() {
      return this.name;
   }

   @Nullable
   public class04891 R() {
      return this.workSound;
   }
}
