package minecraft;

import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.fabric.mixin.command.EntitySelectorOptionsAccessor;
import org.slf4j.Logger;

public class class06767 implements EntitySelectorOptionsAccessor {
   private static final Logger Z = LogUtils.getLogger();
   private static final Map<String, class06800> z = Maps.newHashMap();
   public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("argument.entity.options.unknown", var0));
   public static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("argument.entity.options.inapplicable", var0));
   public static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("argument.entity.options.distance.negative"));
   public static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.L("argument.entity.options.level.negative"));
   public static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.L("argument.entity.options.limit.toosmall"));
   public static final DynamicCommandExceptionType R = new DynamicCommandExceptionType(var0 -> class00392.y("argument.entity.options.sort.irreversible", var0));
   public static final DynamicCommandExceptionType M = new DynamicCommandExceptionType(var0 -> class00392.y("argument.entity.options.mode.invalid", var0));
   public static final DynamicCommandExceptionType B = new DynamicCommandExceptionType(var0 -> class00392.y("argument.entity.options.type.invalid", var0));

   public class06767() {
      super();
   }

   private static void y(String var0, class06798 var1, Predicate<class06790> var2, class00392 var3) {
      z.put(var0, new class06800(var1, var2, var3));
   }

   public static void N(class06790 var0, SuggestionsBuilder var1) {
      String s = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (Entry entry : z.entrySet()) {
         if (((class06800)entry.getValue()).y().test(var0) && ((String)entry.getKey()).toLowerCase(Locale.ROOT).startsWith(s)) {
            var1.suggest((String)entry.getKey() + "=", ((class06800)entry.getValue()).L());
         }
      }
   }

   public static void N() {
      if (z.isEmpty()) {
         y("name", var0 -> {
            int ix = var0.M().getCursor();
            boolean flag = var0.i();
            String s = var0.M().readString();
            if (var0.G() && !flag) {
               var0.M().setCursor(ix);
               throw y.createWithContext(var0.M(), "name");
            } else {
               if (flag) {
                  var0.L(true);
               } else {
                  var0.y(true);
               }

               var0.N(var2x -> var2x.method_74861().equals(s) != flag);
            }
         }, var0 -> !var0.t(), class00392.L("argument.entity.options.name.description"));
         y("distance", var0 -> {
            int ix = var0.M().getCursor();
            class00816 class00816 = class00816.N(var0.M());
            if ((!class00816.y().isPresent() || !(class00816.y().get() < 0.0)) && (!class00816.L().isPresent() || !(class00816.L().get() < 0.0))) {
               var0.N(class00816);
               var0.B();
            } else {
               var0.M().setCursor(ix);
               throw L.createWithContext(var0.M());
            }
         }, var0 -> var0.Z() == null, class00392.L("argument.entity.options.distance.description"));
         y("level", var0 -> {
            int ix = var0.M().getCursor();
            class00836 class00836 = class00836.N(var0.M());
            if ((!class00836.y().isPresent() || class00836.y().get() >= 0) && (!class00836.L().isPresent() || class00836.L().get() >= 0)) {
               var0.N(class00836);
               var0.N(false);
            } else {
               var0.M().setCursor(ix);
               throw u.createWithContext(var0.M());
            }
         }, var0 -> var0.z() == null, class00392.L("argument.entity.options.level.description"));
         y("x", var0 -> {
            var0.B();
            var0.N(var0.M().readDouble());
         }, var0 -> var0.W() == null, class00392.L("argument.entity.options.x.description"));
         y("y", var0 -> {
            var0.B();
            var0.y(var0.M().readDouble());
         }, var0 -> var0.m() == null, class00392.L("argument.entity.options.y.description"));
         y("z", var0 -> {
            var0.B();
            var0.L(var0.M().readDouble());
         }, var0 -> var0.P() == null, class00392.L("argument.entity.options.z.description"));
         y("dx", var0 -> {
            var0.B();
            var0.u(var0.M().readDouble());
         }, var0 -> var0.s() == null, class00392.L("argument.entity.options.dx.description"));
         y("dy", var0 -> {
            var0.B();
            var0.i(var0.M().readDouble());
         }, var0 -> var0.T() == null, class00392.L("argument.entity.options.dy.description"));
         y("dz", var0 -> {
            var0.B();
            var0.R(var0.M().readDouble());
         }, var0 -> var0.b() == null, class00392.L("argument.entity.options.dz.description"));
         y("x_rotation", var0 -> var0.N(class00838.N(var0.M())), var0 -> var0.U() == null, class00392.L("argument.entity.options.x_rotation.description"));
         y("y_rotation", var0 -> var0.y(class00838.N(var0.M())), var0 -> var0.E() == null, class00392.L("argument.entity.options.y_rotation.description"));
         y("limit", var0 -> {
            int ix = var0.M().getCursor();
            int j = var0.M().readInt();
            if (j < 1) {
               var0.M().setCursor(ix);
               throw i.createWithContext(var0.M());
            } else {
               var0.N(j);
               var0.u(true);
            }
         }, var0 -> !var0.n() && !var0.l(), class00392.L("argument.entity.options.limit.description"));
         y("sort", var0 -> {
            int ix = var0.M().getCursor();
            String s = var0.M().readUnquotedString();
            var0.N_63((var0x, var1x) -> class07689.y(Arrays.asList("nearest", "furthest", "random", "arbitrary"), var0x));

            var0.N(switch (s) {
               case "nearest" -> class06790.U;
               case "furthest" -> class06790.E;
               case "random" -> class06790.W;
               case "arbitrary" -> class06794.y;
               default -> {
                  var0.M().setCursor(ix);
                  throw R.createWithContext(var0.M(), s);
               }
            });
            var0.i(true);
         }, var0 -> !var0.n() && !var0.d(), class00392.L("argument.entity.options.sort.description"));
         y("gamemode", var0 -> {
            var0.N_63((var1x, var2x) -> {
               String s1 = var1x.getRemaining().toLowerCase(Locale.ROOT);
               boolean flag1 = !var0.k();
               boolean flag2 = true;
               if (!s1.isEmpty()) {
                  if (s1.charAt(0) == '!') {
                     flag1 = false;
                     s1 = s1.substring(1);
                  } else {
                     flag2 = false;
                  }
               }

               for (class07282 class07282x : class07282.values()) {
                  if (class07282x.y().toLowerCase(Locale.ROOT).startsWith(s1)) {
                     if (flag2) {
                        var1x.suggest("!" + class07282x.y());
                     }

                     if (flag1) {
                        var1x.suggest(class07282x.y());
                     }
                  }
               }

               return var1x.buildFuture();
            });
            int ix = var0.M().getCursor();
            boolean flag = var0.i();
            if (var0.k() && !flag) {
               var0.M().setCursor(ix);
               throw y.createWithContext(var0.M(), "gamemode");
            } else {
               String s = var0.M().readUnquotedString();
               class07282 class07282 = class07282.N(s, null);
               if (class07282 == null) {
                  var0.M().setCursor(ix);
                  throw M.createWithContext(var0.M(), s);
               } else {
                  var0.N(false);
                  var0.N(var2x -> var2x instanceof class04770 ? ((class04770)var2x).method_68876() == class07282 ^ flag : false);
                  if (flag) {
                     var0.M(true);
                  } else {
                     var0.R(true);
                  }
               }
            }
         }, var0 -> !var0.w(), class00392.L("argument.entity.options.gamemode.description"));
         y("team", var0 -> {
            boolean flag = var0.i();
            String s = var0.M().readUnquotedString();
            var0.N(var2x -> {
               class00502 class00502 = var2x.method_5781();
               return (class00502 == null ? "" : class00502.L()).equals(s) != flag;
            });
            if (flag) {
               var0.Z(true);
            } else {
               var0.B(true);
            }
         }, var0 -> !var0.Y(), class00392.L("argument.entity.options.team.description"));
         y("type", var0 -> {
            var0.N_63((var1x, var2x) -> {
               class07689.N(class04206.M.M(), var1x, String.valueOf('!'));
               class07689.N(class04206.M.U().map(var0xx -> var0xx.B().y()), var1x, "!#");
               if (!var0.I()) {
                  class07689.N(class04206.M.M(), var1x);
                  class07689.N(class04206.M.U().map(var0xx -> var0xx.B().y()), var1x, String.valueOf('#'));
               }

               return var1x.buildFuture();
            });
            int ix = var0.M().getCursor();
            boolean flag = var0.i();
            if (var0.I() && !flag) {
               var0.M().setCursor(ix);
               throw y.createWithContext(var0.M(), "type");
            } else {
               if (flag) {
                  var0.O();
               }

               if (var0.R()) {
                  class03530 class03530 = class03530.N(class04227.I, class01894.N(var0.M()));
                  var0.N(var2x -> var2x.method_5864().N(class03530) != flag);
               } else {
                  class01894 class01894 = class01894.N(var0.M());
                  class07078<?> class07078 = class04206.M.y(class01894).orElseThrow(() -> {
                     var0.M().setCursor(ix);
                     return B.createWithContext(var0.M(), class01894.toString());
                  });
                  if (Objects.equals(class07078.Ly, class07078) && !flag) {
                     var0.N(false);
                  }

                  var0.N(var2x -> Objects.equals(class07078, var2x.method_5864()) != flag);
                  if (!flag) {
                     var0.N(class07078);
                  }
               }
            }
         }, var0 -> !var0.g(), class00392.L("argument.entity.options.type.description"));
         y("tag", var0 -> {
            boolean flag = var0.i();
            String s = var0.M().readUnquotedString();
            var0.N(var2x -> "".equals(s) ? var2x.method_5752().isEmpty() != flag : var2x.method_5752().contains(s) != flag);
         }, var0 -> true, class00392.L("argument.entity.options.tag.description"));
         y("nbt", var0 -> {
            boolean flag = var0.i();
            class07001 class07001 = class07755.L(var0.M());
            var0.N(var2x -> {
               boolean flag1;
               try (class04495 class04495 = new class04495(var2x.method_71370(), Z)) {
                  class08303 class08303 = class08303.N(class04495, var2x.method_56673());
                  var2x.method_5647(class08303);
                  if (var2x instanceof class04770 class04770) {
                     class06584 class06584 = class04770.method_31548().y();
                     if (!class06584.R()) {
                        class08303.N("SelectedItem", class06584.y, class06584);
                     }
                  }

                  flag1 = class07717.N(class07001, class08303.y(), true) != flag;
               }

               return flag1;
            });
         }, var0 -> true, class00392.L("argument.entity.options.nbt.description"));
         y("scores", var0 -> {
            StringReader stringreader = var0.M();
            HashMap hashmap = Maps.newHashMap();
            stringreader.expect('{');
            stringreader.skipWhitespace();

            while (stringreader.canRead() && stringreader.peek() != '}') {
               stringreader.skipWhitespace();
               String s = stringreader.readUnquotedString();
               stringreader.skipWhitespace();
               stringreader.expect('=');
               stringreader.skipWhitespace();
               class00836 class00836 = class00836.N(stringreader);
               hashmap.put(s, class00836);
               stringreader.skipWhitespace();
               if (stringreader.canRead() && stringreader.peek() == ',') {
                  stringreader.skip();
               }
            }

            stringreader.expect('}');
            if (!hashmap.isEmpty()) {
               var0.N(var1x -> {
                  class06394 class06394 = var1x.method_73183().method_8503().yB();

                  for (Entry entry : hashmap.entrySet()) {
                     class00518 class00518 = class06394.N((String)entry.getKey());
                     if (class00518 == null) {
                        return false;
                     }

                     class01788 class01788 = class06394.y(var1x, class00518);
                     if (class01788 == null) {
                        return false;
                     }

                     if (!((class00836)entry.getValue()).u(class01788.y())) {
                        return false;
                     }
                  }

                  return true;
               });
            }

            var0.z(true);
         }, var0 -> !var0.J(), class00392.L("argument.entity.options.scores.description"));
         y("advancements", var0 -> {
            StringReader stringreader = var0.M();
            HashMap hashmap = Maps.newHashMap();
            stringreader.expect('{');
            stringreader.skipWhitespace();

            while (stringreader.canRead() && stringreader.peek() != '}') {
               stringreader.skipWhitespace();
               class01894 class01894 = class01894.N(stringreader);
               stringreader.skipWhitespace();
               stringreader.expect('=');
               stringreader.skipWhitespace();
               if (stringreader.canRead() && stringreader.peek() == '{') {
                  HashMap hashmap1 = Maps.newHashMap();
                  stringreader.skipWhitespace();
                  stringreader.expect('{');
                  stringreader.skipWhitespace();

                  while (stringreader.canRead() && stringreader.peek() != '}') {
                     stringreader.skipWhitespace();
                     String s = stringreader.readUnquotedString();
                     stringreader.skipWhitespace();
                     stringreader.expect('=');
                     stringreader.skipWhitespace();
                     boolean flag1 = stringreader.readBoolean();
                     hashmap1.put(s, var1x -> var1x.N() == flag1);
                     stringreader.skipWhitespace();
                     if (stringreader.canRead() && stringreader.peek() == ',') {
                        stringreader.skip();
                     }
                  }

                  stringreader.skipWhitespace();
                  stringreader.expect('}');
                  stringreader.skipWhitespace();
                  hashmap.put(class01894, var1x -> {
                     for (Entry entry : hashmap1.entrySet()) {
                        class06562 class06562 = var1x.L((String)entry.getKey());
                        if (class06562 == null || !((Predicate)entry.getValue()).test(class06562)) {
                           return false;
                        }
                     }

                     return true;
                  });
               } else {
                  boolean flag = stringreader.readBoolean();
                  hashmap.put(class01894, var1x -> var1x.N() == flag);
               }

               stringreader.skipWhitespace();
               if (stringreader.canRead() && stringreader.peek() == ',') {
                  stringreader.skip();
               }
            }

            stringreader.expect('}');
            if (!hashmap.isEmpty()) {
               var0.N(var1x -> {
                  if (!(var1x instanceof class04770 class04770)) {
                     return false;
                  } else {
                     class03704 class03704 = class04770.method_14236();
                     class04478 class04478 = class04770.method_51469().method_8503().Nh();

                     for (Entry entry : hashmap.entrySet()) {
                        class03711 class03711 = class04478.N((class01894)entry.getKey());
                        if (class03711 == null || !((Predicate)entry.getValue()).test(class03704.y(class03711))) {
                           return false;
                        }
                     }

                     return true;
                  }
               });
               var0.N(false);
            }

            var0.U(true);
         }, var0 -> !var0.o(), class00392.L("argument.entity.options.advancements.description"));
         y("predicate", var0 -> {
            boolean flag = var0.i();
            class05946 class05946 = class05946.N(class04227.yq, class01894.N(var0.M()));
            var0.N(var2x -> {
               if (var2x.method_73183() instanceof class04782 class04782) {
                  Optional optional = class04782.method_8503().yd().N().u(class05946).map(class03556::N);
                  if (optional.isEmpty()) {
                     return false;
                  } else {
                     class04162 class04162 = new class04160(class04782).N(class06551.N, var2x).N(class06551.B, var2x.method_73189()).N(class06925.R);
                     class05908 class05908 = new class05927(class04162).N(Optional.empty());
                     class05908.y(class05908.N((class05957)optional.get()));
                     return flag ^ ((class05957)optional.get()).test(class05908);
                  }
               } else {
                  return false;
               }
            });
         }, var0 -> true, class00392.L("argument.entity.options.predicate.description"));
      }
   }

   public static class06798 N(class06790 var0, String var1, int var2) throws CommandSyntaxException {
      class06800 class06800 = z.get(var1);
      if (class06800 != null) {
         if (class06800.y().test(var0)) {
            return class06800.N();
         } else {
            throw y.createWithContext(var0.M(), var1);
         }
      } else {
         var0.M().setCursor(var2);
         throw N.createWithContext(var0.M(), var1);
      }
   }
}
