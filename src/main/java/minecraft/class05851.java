package minecraft;

public class class05851<T extends class07482> implements class02995 {
   public static final class05851<class07490> field_18664 = method_17435("generic_9x1", class07490::N);
   public static final class05851<class07490> field_18665 = method_17435("generic_9x2", class07490::y);
   public static final class05851<class07490> field_17326 = method_17435("generic_9x3", class07490::L);
   public static final class05851<class07490> field_18666 = method_17435("generic_9x4", class07490::u);
   public static final class05851<class07490> field_18667 = method_17435("generic_9x5", class07490::i);
   public static final class05851<class07490> field_17327 = method_17435("generic_9x6", class07490::R);
   public static final class05851<class07502> field_17328 = method_17435("generic_3x3", class07502::new);
   public static final class05851<class01712> field_46790 = method_17435("crafter_3x3", class01712::new);
   public static final class05851<class07497> field_17329 = method_17435("anvil", class07497::new);
   public static final class05851<class07501> field_17330 = method_17435("beacon", class07501::new);
   public static final class05851<class06096> field_17331 = method_17435("blast_furnace", class06096::new);
   public static final class05851<class07489> field_17332 = method_17435("brewing_stand", class07489::new);
   public static final class05851<class07485> field_17333 = method_17435("crafting", class07485::new);
   public static final class05851<class07500> field_17334 = method_17435("enchantment", class07500::new);
   public static final class05851<class05670> field_17335 = method_17435("furnace", class05670::new);
   public static final class05851<class05262> field_17336 = method_17435("grindstone", class05262::new);
   public static final class05851<class07478> field_17337 = method_17435("hopper", class07478::new);
   public static final class05851<class05856> field_17338 = method_17435("lectern", (var0, var1) -> new class05856(var0));
   public static final class05851<class06951> field_17339 = method_17435("loom", class06951::new);
   public static final class05851<class06952> field_17340 = method_17435("merchant", class06952::new);
   public static final class05851<class06922> field_17341 = method_17435("shulker_box", class06922::new);
   public static final class05851<class04974> field_22484 = method_17435("smithing", class04974::new);
   public static final class05851<class06085> field_17342 = method_17435("smoker", class06085::new);
   public static final class05851<class06231> field_17343 = method_17435("cartography_table", class06231::new);
   public static final class05851<class06146> field_17625 = method_17435("stonecutter", class06146::new);
   private final class03767 field_41923;
   private final class05837<T> field_17344;

   public class05851(class05837<T> var1, class03767 var2) {
      super();
      this.field_17344 = var1;
      this.field_41923 = var2;
   }

   public T method_17434(int var1, class08044 var2) {
      return this.field_17344.create(var1, var2);
   }

   private static <T extends class07482> class05851<T> method_17435(String var0, class05837<T> var1) {
      return class00751.N(class04206.T, var0, new class05851<>(var1, class03794.M));
   }

   private static <T extends class07482> class05851<T> method_48387(String var0, class05837<T> var1, class02957... var2) {
      return class00751.N(class04206.T, var0, new class05851<>(var1, class03794.i.N(var2)));
   }

   @Override
   public class03767 method_45322() {
      return this.field_41923;
   }
}
