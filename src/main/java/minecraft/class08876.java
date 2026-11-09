package minecraft;

import Nursultan.class09176;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.chars.CharList;
import java.util.HexFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;

public class class08876 {
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(var0 -> class00392.y("snbt.parser.number_parse_failure", var0));
   public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("snbt.parser.expected_hex_escape", var0));
   private static final DynamicCommandExceptionType R = new DynamicCommandExceptionType(var0 -> class00392.y("snbt.parser.invalid_codepoint", var0));
   private static final DynamicCommandExceptionType M = new DynamicCommandExceptionType(var0 -> class00392.y("snbt.parser.no_such_operation", var0));
   static final class08524<CommandSyntaxException> y = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.expected_integer_type")));
   private static final class08524<CommandSyntaxException> B = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.expected_float_type")));
   static final class08524<CommandSyntaxException> L = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.expected_non_negative_number")));
   private static final class08524<CommandSyntaxException> Z = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.invalid_character_name")));
   static final class08524<CommandSyntaxException> u = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.invalid_array_element_type")));
   private static final class08524<CommandSyntaxException> z = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.invalid_unquoted_start")));
   private static final class08524<CommandSyntaxException> U = class08524.N(
      new SimpleCommandExceptionType(class00392.L("snbt.parser.expected_unquoted_string"))
   );
   private static final class08524<CommandSyntaxException> E = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.invalid_string_contents")));
   private static final class08524<CommandSyntaxException> W = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.expected_binary_numeral")));
   private static final class08524<CommandSyntaxException> m = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.underscore_not_allowed")));
   private static final class08524<CommandSyntaxException> P = class08524.N(
      new SimpleCommandExceptionType(class00392.L("snbt.parser.expected_decimal_numeral"))
   );
   private static final class08524<CommandSyntaxException> s = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.expected_hex_numeral")));
   private static final class08524<CommandSyntaxException> T = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.empty_key")));
   private static final class08524<CommandSyntaxException> b = class08524.N(
      new SimpleCommandExceptionType(class00392.L("snbt.parser.leading_zero_not_allowed"))
   );
   private static final class08524<CommandSyntaxException> j = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.infinity_not_allowed")));
   private static final HexFormat v = HexFormat.of().withUpperCase();
   private static final class08499 n = new class08850(W, m);
   private static final class08499 t = new class08863(P, m);
   private static final class08499 G = new class08891(s, m);
   private static final class08522 l = new class08851(1, E);
   private static final class02165 d = new class08878(CharList.of());
   private static final Pattern w = Pattern.compile("[-a-zA-Z0-9 ]+");

   private static boolean L(char var0) {
      return !y(var0);
   }

   public class08876() {
      super();
   }

   static boolean y(char var0) {
      return switch (var0) {
         case '+', '-', '.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> true;
         default -> false;
      };
   }

   @Nullable
   private static <T> T y(DynamicOps<T> var0, class02325<?> var1, String var2) {
      double d0 = Double.parseDouble(var2);
      if (!Double.isFinite(d0)) {
         var1.y().N(var1.M(), j);
         return null;
      } else {
         return (T)var0.createDouble(d0);
      }
   }

   @Nullable
   public static String N(char var0) {
      return switch (var0) {
         case '\b' -> "b";
         case '\t' -> "t";
         case '\n' -> "n";
         default -> var0 < ' ' ? "x" + v.toHexDigits((byte)var0) : null;
         case '\f' -> "f";
         case '\r' -> "r";
      };
   }

   static class08524<CommandSyntaxException> N(NumberFormatException var0) {
      return class08524.N(i, var0.getMessage());
   }

   private static String N(List<String> var0) {
      return switch (var0.size()) {
         case 0 -> "";
         case 1 -> (String)var0.getFirst();
         default -> String.join("", var0);
      };
   }

   public static <T> class02169<T> N(DynamicOps<T> var0) {
      Object object = var0.createBoolean(true);
      Object object1 = var0.createBoolean(false);
      Object object2 = var0.emptyMap();
      Object object3 = var0.emptyList();
      class02344 class02344 = new class02344();
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx = class02353.N("sign");
      class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx,
         class02315.y(
            class02315.N(class02179.N('+'), class02315.N(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, class00150.field_58014)),
            class02315.N(class02179.N('-'), class02315.N(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, class00150.field_58015))
         ),
         var1x -> var1x.y(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx)
      );
      class02353 class02353x = class02353.N("integer_suffix");
      class02344.N(
         class02353x,
         class02315.y(
            class02315.N(
               class02179.N('u', 'U'),
               class02315.y(
                  class02315.N(class02179.N('b', 'B'), class02315.N(class02353x, new class00154(class00162.field_58018, class00157.field_58022))),
                  class02315.N(class02179.N('s', 'S'), class02315.N(class02353x, new class00154(class00162.field_58018, class00157.field_58023))),
                  class02315.N(class02179.N('i', 'I'), class02315.N(class02353x, new class00154(class00162.field_58018, class00157.field_58024))),
                  class02315.N(class02179.N('l', 'L'), class02315.N(class02353x, new class00154(class00162.field_58018, class00157.field_58025)))
               )
            ),
            class02315.N(
               class02179.N('s', 'S'),
               class02315.y(
                  class02315.N(class02179.N('b', 'B'), class02315.N(class02353x, new class00154(class00162.field_58017, class00157.field_58022))),
                  class02315.N(class02179.N('s', 'S'), class02315.N(class02353x, new class00154(class00162.field_58017, class00157.field_58023))),
                  class02315.N(class02179.N('i', 'I'), class02315.N(class02353x, new class00154(class00162.field_58017, class00157.field_58024))),
                  class02315.N(class02179.N('l', 'L'), class02315.N(class02353x, new class00154(class00162.field_58017, class00157.field_58025)))
               )
            ),
            class02315.N(class02179.N('b', 'B'), class02315.N(class02353x, new class00154(null, class00157.field_58022))),
            class02315.N(class02179.N('s', 'S'), class02315.N(class02353x, new class00154(null, class00157.field_58023))),
            class02315.N(class02179.N('i', 'I'), class02315.N(class02353x, new class00154(null, class00157.field_58024))),
            class02315.N(class02179.N('l', 'L'), class02315.N(class02353x, new class00154(null, class00157.field_58025)))
         ),
         var1x -> var1x.y(class02353xxxxxxxxxxxxxx)
      );
      class02353 class02353xx = class02353.N("binary_numeral");
      class02344.N(class02353xx, n);
      class02353 class02353xxx = class02353.N("decimal_numeral");
      class02344.N(class02353xxx, t);
      class02353 class02353xxxx = class02353.N("hex_numeral");
      class02344.N(class02353xxxx, G);
      class02353 class02353xxxxx = class02353.N("integer_literal");
      class08501 class08501xxx = class02344.N(
         class02353xxxxx,
         class02315.N(
            class02315.N(class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx)),
            class02315.y(
               class02315.N(
                  class02179.N('0'),
                  class02315.L(),
                  class02315.y(
                     class02315.N(class02179.N('x', 'X'), class02315.L(), class02344.L(class02353xxxx)),
                     class02315.N(class02179.N('b', 'B'), class02344.L(class02353xx)),
                     class02315.N(class02344.L(class02353xxx), class02315.L(), class02315.N(b)),
                     class02315.N(class02353xxx, "0")
                  )
               ),
               class02344.L(class02353xxx)
            ),
            class02315.N(class02344.L(class02353x))
         ),
         var5x -> {
            class00154 class00154 = var5x.y(class02353xxxxxxxxxxxxxx, class00154.L);
            class00150 class00150 = var5x.y(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, class00150.field_58014);
            String sx = var5x.N(class02353xxxxxxxxxxxx);
            if (sx != null) {
               return new class00170(class00150, class00182.field_58010, sx, class00154);
            } else {
               String s1 = var5x.N(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxx);
               if (s1 != null) {
                  return new class00170(class00150, class00182.field_58011, s1, class00154);
               } else {
                  String s2 = var5x.y(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx);
                  return new class00170(class00150, class00182.field_58009, s2, class00154);
               }
            }
         }
      );
      class02353 class02353xxxxxx = class02353.N("float_type_suffix");
      class02344.N(
         class02353xxxxxx,
         class02315.y(
            class02315.N(class02179.N('f', 'F'), class02315.N(class02353xxxxxx, class00157.field_58020)),
            class02315.N(class02179.N('d', 'D'), class02315.N(class02353xxxxxx, class00157.field_58021))
         ),
         var1x -> var1x.y(class02353xxxxxxxx)
      );
      class02353 class02353xxxxxxx = class02353.N("float_exponent_part");
      class02344.N(
         class02353xxxxxxx,
         class02315.N(class02179.N('e', 'E'), class02315.N(class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx)), class02344.L(class02353xxx)),
         var2x -> new class00139<>(var2x.y(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, class00150.field_58014), (String)var2x.y(class02353xxxxxxxxxxxx))
      );
      class02353 class02353xxxxxxxx = class02353.N("float_whole_part");
      class02353 class02353xxxxxxxxx = class02353.N("float_fraction_part");
      class02353 class02353xxxxxxxxxx = class02353.N("float_literal");
      class02344.N(
         class02353xxxxxxxxxx,
         class02315.N(
            class02315.N(class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx)),
            class02315.y(
               class02315.N(
                  class02344.N(class02353xxx, class02353xxxxxxxx),
                  class02179.N('.'),
                  class02315.L(),
                  class02315.N(class02344.N(class02353xxx, class02353xxxxxxxxx)),
                  class02315.N(class02344.L(class02353xxxxxxx)),
                  class02315.N(class02344.L(class02353xxxxxx))
               ),
               class02315.N(
                  class02179.N('.'),
                  class02315.L(),
                  class02344.N(class02353xxx, class02353xxxxxxxxx),
                  class02315.N(class02344.L(class02353xxxxxxx)),
                  class02315.N(class02344.L(class02353xxxxxx))
               ),
               class02315.N(
                  class02344.N(class02353xxx, class02353xxxxxxxx),
                  class02344.L(class02353xxxxxxx),
                  class02315.L(),
                  class02315.N(class02344.L(class02353xxxxxx))
               ),
               class02315.N(class02344.N(class02353xxx, class02353xxxxxxxx), class02315.N(class02344.L(class02353xxxxxxx)), class02344.L(class02353xxxxxx))
            )
         ),
         var6x -> {
            class02332 class02332 = var6x.N();
            class00150 class00150 = class02332.y(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, class00150.field_58014);
            String sx = class02332.N(class02353xxxxxxx);
            String s1 = class02332.N(class02353xxxxxxxxxxxxxxxxxxxxxxxxx);
            class00139 class00139 = class02332.N(class02353xxxxxxxxxxxxxxxxxxxxxxxxxx);
            class00157 class00157 = class02332.N(class02353xxxxxxxx);
            return N(var0, class00150, sx, s1, class00139, class00157, var6x);
         }
      );
      class02353 class02353xxxxxxxxxxx = class02353.N("string_hex_2");
      class02344.N(class02353xxxxxxxxxxx, new class09176(2));
      class02353 class02353xxxxxxxxxxxx = class02353.N("string_hex_4");
      class02344.N(class02353xxxxxxxxxxxx, new class09176(4));
      class02353 class02353xxxxxxxxxxxxx = class02353.N("string_hex_8");
      class02344.N(class02353xxxxxxxxxxxxx, new class09176(8));
      class02353 class02353xxxxxxxxxxxxxx = class02353.N("string_unicode_name");
      class02344.N(class02353xxxxxxxxxxxxxx, new class08513(w, Z));
      class02353 class02353xxxxxxxxxxxxxxx = class02353.N("string_escape_sequence");
      class02344.N(
         class02353xxxxxxxxxxxxxxx,
         class02315.y(
            class02315.N(class02179.N('b'), class02315.N(class02353xxxxxxxxxxxxxxx, "\b")),
            class02315.N(class02179.N('s'), class02315.N(class02353xxxxxxxxxxxxxxx, " ")),
            class02315.N(class02179.N('t'), class02315.N(class02353xxxxxxxxxxxxxxx, "\t")),
            class02315.N(class02179.N('n'), class02315.N(class02353xxxxxxxxxxxxxxx, "\n")),
            class02315.N(class02179.N('f'), class02315.N(class02353xxxxxxxxxxxxxxx, "\f")),
            class02315.N(class02179.N('r'), class02315.N(class02353xxxxxxxxxxxxxxx, "\r")),
            class02315.N(class02179.N('\\'), class02315.N(class02353xxxxxxxxxxxxxxx, "\\")),
            class02315.N(class02179.N('\''), class02315.N(class02353xxxxxxxxxxxxxxx, "'")),
            class02315.N(class02179.N('"'), class02315.N(class02353xxxxxxxxxxxxxxx, "\"")),
            class02315.N(class02179.N('x'), class02344.L(class02353xxxxxxxxxxx)),
            class02315.N(class02179.N('u'), class02344.L(class02353xxxxxxxxxxxx)),
            class02315.N(class02179.N('U'), class02344.L(class02353xxxxxxxxxxxxx)),
            class02315.N(class02179.N('N'), class02179.N('{'), class02344.L(class02353xxxxxxxxxxxxxx), class02179.N('}'))
         ),
         var5x -> {
            class02332 class02332 = var5x.N();
            String sx = class02332.y(class02353xxxxxxxxxxxxxxxxxxxxxx);
            if (sx != null) {
               return sx;
            } else {
               String s1 = class02332.y(class02353xxxxxxxxxxxxxxxxxxxxxxxx, class02353xxxxx, class02353xxxxxxxxxxxxxxxxxxxxxxx);
               if (s1 != null) {
                  int jx = HexFormat.fromHexDigits(s1);
                  if (!Character.isValidCodePoint(jx)) {
                     var5x.y().N(var5x.M(), class08524.N(R, String.format(Locale.ROOT, "U+%08X", jx)));
                     return null;
                  } else {
                     return Character.toString(jx);
                  }
               } else {
                  String s2 = class02332.y(class02353xxxx);

                  int ix;
                  try {
                     ix = Character.codePointOf(s2);
                  } catch (IllegalArgumentException illegalargumentexception) {
                     var5x.y().N(var5x.M(), Z);
                     return null;
                  }

                  return Character.toString(ix);
               }
            }
         }
      );
      class02353 class02353xxxxxxxxxxxxxxxx = class02353.N("string_plain_contents");
      class02344.N(class02353xxxxxxxxxxxxxxxx, l);
      class02353 class02353xxxxxxxxxxxxxxxxx = class02353.N("string_chunks");
      class02353 class02353xxxxxxxxxxxxxxxxxx = class02353.N("string_contents");
      class02353 class02353xxxxxxxxxxxxxxxxxxx = class02353.N("single_quoted_string_chunk");
      class08501 class08501x = class02344.N(
         class02353xxxxxxxxxxxxxxxxxxx,
         class02315.y(
            class02344.N(class02353xxxxxxxxxxxxxxxx, class02353xxxxxxxxxxxxxxxxxx),
            class02315.N(class02179.N('\\'), class02344.N(class02353xxxxxxxxxxxxxxx, class02353xxxxxxxxxxxxxxxxxx)),
            class02315.N(class02179.N('"'), class02315.N(class02353xxxxxxxxxxxxxxxxxx, "\""))
         ),
         var1x -> var1x.y(class02353xx)
      );
      class02353 class02353xxxxxxxxxxxxxxxxxxxx = class02353.N("single_quoted_string_contents");
      class02344.N(class02353xxxxxxxxxxxxxxxxxxxx, class02315.N(class08501x, class02353xxxxxxxxxxxxxxxxx), var1x -> N(var1x.y(class02353xxxxxxxxxxxxxxxxxxxxx)));
      class02353 class02353xxxxxxxxxxxxxxxxxxxxx = class02353.N("double_quoted_string_chunk");
      class08501 class08501xx = class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxx,
         class02315.y(
            class02344.N(class02353xxxxxxxxxxxxxxxx, class02353xxxxxxxxxxxxxxxxxx),
            class02315.N(class02179.N('\\'), class02344.N(class02353xxxxxxxxxxxxxxx, class02353xxxxxxxxxxxxxxxxxx)),
            class02315.N(class02179.N('\''), class02315.N(class02353xxxxxxxxxxxxxxxxxx, "'"))
         ),
         var1x -> var1x.y(class02353xx)
      );
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxx = class02353.N("double_quoted_string_contents");
      class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxx, class02315.N(class08501xx, class02353xxxxxxxxxxxxxxxxx), var1x -> N(var1x.y(class02353xxxxxxxxxxxxxxxxxxxxx))
      );
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxx = class02353.N("quoted_string_literal");
      class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxxx,
         class02315.y(
            class02315.N(
               class02179.N('"'), class02315.L(), class02315.N(class02344.N(class02353xxxxxxxxxxxxxxxxxxxxxx, class02353xxxxxxxxxxxxxxxxxx)), class02179.N('"')
            ),
            class02315.N(class02179.N('\''), class02315.N(class02344.N(class02353xxxxxxxxxxxxxxxxxxxx, class02353xxxxxxxxxxxxxxxxxx)), class02179.N('\''))
         ),
         var1x -> var1x.y(class02353xx)
      );
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxxx = class02353.N("unquoted_string");
      class02344.N(class02353xxxxxxxxxxxxxxxxxxxxxxxx, new class08515(1, U));
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxxxx = class02353.N("literal");
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxxxxx = class02353.N("arguments");
      class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxxxxxx,
         class02315.N(class02344.y(class02353xxxxxxxxxxxxxxxxxxxxxxxxx), class02353xxxxxxxxxxxxxxxxxxxxxxxxxx, class02179.N(',')),
         var1x -> (T)((List)var1x.y(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx))
      );
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxxxxxx = class02353.N("unquoted_string_or_builtin");
      class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxxxxxxx,
         class02315.N(
            class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxxx),
            class02315.N(class02315.N(class02179.N('('), class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxxxxx), class02179.N(')')))
         ),
         var5x -> {
            class02332 class02332 = var5x.N();
            String sx = class02332.y(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx);
            if (!sx.isEmpty() && L(sx.charAt(0))) {
               List list = class02332.N(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx);
               if (list != null) {
                  class00164 class00164 = new class00164(sx, list.size());
                  class00171 class00171 = class00174.i.get(class00164);
                  if (class00171 != null) {
                     return class00171.N(var0, list, var5x);
                  } else {
                     var5x.y().N(var5x.M(), class08524.N(M, class00164.toString()));
                     return null;
                  }
               } else if (sx.equalsIgnoreCase("true")) {
                  return object;
               } else {
                  return sx.equalsIgnoreCase("false") ? object1 : var0.createString(sx);
               }
            } else {
               var5x.y().N(var5x.M(), class00174.R, z);
               return null;
            }
         }
      );
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxx = class02353.N("map_key");
      class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxx,
         class02315.y(class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxx), class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxxx)),
         var2x -> var2x.L(class02353xxxxxxxxxxxxxxxxxx, class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx)
      );
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxx = class02353.N("map_entry");
      class08501 class08501xxx = class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxx,
         class02315.N(class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxx), class02179.N(':'), class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxxxx)),
         var2x -> {
            class02332 class02332 = var2x.N();
            String sx = class02332.y(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx);
            if (sx.isEmpty()) {
               var2x.y().N(var2x.M(), T);
               return null;
            } else {
               Object objectx = class02332.y(class02353xxxxxxxxxxxxxxxxx);
               return Map.entry(sx, objectx);
            }
         }
      );
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx = class02353.N("map_entries");
      class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx,
         class02315.N(class08501xxx, class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, class02179.N(',')),
         var1x -> (T)((List)var1x.y(class02353xxxxxxxxxxxxx))
      );
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx = class02353.N("map_literal");
      class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx,
         class02315.N(class02179.N('{'), class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx), class02179.N('}')),
         var3x -> {
            List list = var3x.y(class02353xxxxxxxxxxxxx);
            if (list.isEmpty()) {
               return object2;
            } else {
               Builder builder = ImmutableMap.builderWithExpectedSize(list.size());

               for (Entry entry : list) {
                  builder.put(var0.createString((String)entry.getKey()), entry.getValue());
               }

               return var0.createMap(builder.buildKeepingLast());
            }
         }
      );
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx = class02353.N("list_entries");
      class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx,
         class02315.N(class02344.y(class02353xxxxxxxxxxxxxxxxxxxxxxxxx), class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, class02179.N(',')),
         var1x -> (T)((List)var1x.y(class02353xxxxxxxxxxx))
      );
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx = class02353.N("array_prefix");
      class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx,
         class02315.y(
            class02315.N(class02179.N('B'), class02315.N(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, class08886.field_58002)),
            class02315.N(class02179.N('L'), class02315.N(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, class08886.field_58004)),
            class02315.N(class02179.N('I'), class02315.N(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, class08886.field_58003))
         ),
         var1x -> var1x.y(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxx)
      );
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx = class02353.N("int_array_entries");
      class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx,
         class02315.N(class08501xxx, class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, class02179.N(',')),
         var1x -> (T)((List)var1x.y(class02353xxxxxxxxx))
      );
      class02353 class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx = class02353.N("list_literal");
      class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx,
         class02315.N(
            class02179.N('['),
            class02315.y(
               class02315.N(
                  class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx), class02179.N(';'), class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx)
               ),
               class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx)
            ),
            class02179.N(']')
         ),
         var5x -> {
            class02332 class02332 = var5x.N();
            class08886 class08886 = class02332.N(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxx);
            if (class08886 != null) {
               List list1 = class02332.y(class02353xxxxxxxxx);
               return list1.isEmpty() ? class08886.N(var0) : class08886.N(var0, list1, var5x);
            } else {
               List list = class02332.y(class02353xxxxxxxxxxx);
               return list.isEmpty() ? object3 : var0.createList(list.stream());
            }
         }
      );
      class08501 class08501xxxx = class02344.N(
         class02353xxxxxxxxxxxxxxxxxxxxxxxxx,
         class02315.y(
            class02315.N(class02315.y(d), class02315.y(class02344.N(class02353xxxxxxxxxx, class02353xxxxxxxxxxxxxxxxxxxxxxxxx), class02344.L(class02353xxxxx))),
            class02315.N(class02315.y(class02179.N('"', '\'')), class02315.L(), class02344.L(class02353xxxxxxxxxxxxxxxxxxxxxxx)),
            class02315.N(
               class02315.y(class02179.N('{')), class02315.L(), class02344.N(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, class02353xxxxxxxxxxxxxxxxxxxxxxxxx)
            ),
            class02315.N(
               class02315.y(class02179.N('[')),
               class02315.L(),
               class02344.N(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx, class02353xxxxxxxxxxxxxxxxxxxxxxxxx)
            ),
            class02344.N(class02353xxxxxxxxxxxxxxxxxxxxxxxxxxx, class02353xxxxxxxxxxxxxxxxxxxxxxxxx)
         ),
         var4x -> {
            class02332 class02332 = var4x.N();
            String sx = class02332.N(class02353xxxxxxxxxxxxxxxxxx);
            if (sx != null) {
               return var0.createString(sx);
            } else {
               class00170 class00170 = class02332.N(class02353xxxxxxxxxx);
               return class00170 != null ? class00170.N(var0, var4x) : class02332.y(class02353xxxxxxxxxxxxxxxxx);
            }
         }
      );
      return new class02169<>(class02344, class08501xxxx);
   }

   static void N(StringBuilder var0, String var1, boolean var2) {
      if (var2) {
         for (char c0 : var1.toCharArray()) {
            if (c0 != '_') {
               var0.append(c0);
            }
         }
      } else {
         var0.append(var1);
      }
   }

   @Nullable
   private static <T> T N(DynamicOps<T> var0, class02325<?> var1, String var2) {
      float f = Float.parseFloat(var2);
      if (!Float.isFinite(f)) {
         var1.y().N(var1.M(), j);
         return null;
      } else {
         return (T)var0.createFloat(f);
      }
   }

   @Nullable
   private static <T> T N(
      DynamicOps<T> var0,
      class00150 var1,
      @Nullable String var2,
      @Nullable String var3,
      @Nullable class00139<String> var4,
      @Nullable class00157 var5,
      class02325<?> var6
   ) {
      StringBuilder stringbuilder = new StringBuilder();
      var1.N(stringbuilder);
      if (var2 != null) {
         N(stringbuilder, var2);
      }

      if (var3 != null) {
         stringbuilder.append('.');
         N(stringbuilder, var3);
      }

      if (var4 != null) {
         stringbuilder.append('e');
         var4.N().N(stringbuilder);
         N(stringbuilder, (String)var4.y());
      }

      try {
         String sx = stringbuilder.toString();

         return (T)(switch (var5) {
            case null -> (Object)y(var0, var6, sx);
            case FLOAT -> (Object)N(var0, var6, sx);
            case DOUBLE -> (Object)y(var0, var6, sx);
            default -> {
               var6.y().N(var6.M(), B);
               yield null;
            }
         });
      } catch (NumberFormatException numberformatexception) {
         var6.y().N(var6.M(), N(numberformatexception));
         return null;
      }
   }

   static short N(String var0, int var1) {
      int ix = Integer.parseInt(var0, var1);
      if (ix >> 16 == 0) {
         return (short)ix;
      } else {
         throw new NumberFormatException("out of range: " + ix);
      }
   }

   private static void N(StringBuilder var0, String var1) {
      N(var0, var1, N(var1));
   }

   static boolean N(String var0) {
      return var0.indexOf(95) != -1;
   }
}
