package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class class07713 implements DynamicOps<class07709> {
   public static final class07713 N = new class07713();

   public DataResult<Stream<Pair<class07709, class07709>>> getMapValues(class07709 var1) {
      return var1 instanceof class07001
         ? DataResult.success(((class07001)var1).M().stream().map(var1x -> Pair.of(this.createString(var1x.getKey()), var1x.getValue())))
         : DataResult.error(() -> "Not a map: " + var1);
   }

   public class07709 emptyMap() {
      return new class07001();
   }

   public DataResult<Consumer<Consumer<class07709>>> getList(class07709 var1) {
      return var1 instanceof class07023 ? DataResult.success(((class07023)var1)::forEach) : DataResult.error(() -> "Not a list: " + var1);
   }

   private class07713() {
      super();
   }

   @Override
   public String toString() {
      return "NBT";
   }

   public DataResult<ByteBuffer> getByteBuffer(class07709 var1) {
      return var1 instanceof class07029 ? DataResult.success(ByteBuffer.wrap(((class07029)var1).i())) : super.getByteBuffer(var1);
   }

   public DataResult<IntStream> getIntStream(class07709 var1) {
      return var1 instanceof class06995 ? DataResult.success(Arrays.stream(((class06995)var1).M())) : super.getIntStream(var1);
   }

   public DataResult<MapLike<class07709>> getMap(class07709 var1) {
      return var1 instanceof class07001 class07001 ? DataResult.success(new class07744(this, class07001)) : DataResult.error(() -> "Not a map: " + var1);
   }

   private static Optional<class07723> U(class07709 var0) {
      if (var0 instanceof class06997) {
         return Optional.of(new class07743());
      } else if (var0 instanceof Object object) {
         if (((class07023)object).isEmpty()) {
            return Optional.of(new class07743());
         } else {
            return switch (object) {
               case class07741 class07741 -> Optional.of(new class07743(class07741));
               case class07029 class07029 -> Optional.of(new class07754(class07029.i()));
               case class06995 class06995 -> Optional.of(new class07731(class06995.M()));
               case class07757 class07757 -> Optional.of(new class07721(class07757.M()));
               default -> throw new MatchException(null, null);
            };
         }
      } else {
         return Optional.empty();
      }
   }

   public DataResult<LongStream> getLongStream(class07709 var1) {
      return var1 instanceof class07757 ? DataResult.success(Arrays.stream(((class07757)var1).M())) : super.getLongStream(var1);
   }

   public DataResult<Consumer<BiConsumer<class07709, class07709>>> getMapEntries(class07709 var1) {
      return var1 instanceof class07001 class07001 ? DataResult.success((Consumer<BiConsumer>)var2x -> {
         for (Entry entry : class07001.M()) {
            var2x.accept(this.createString((String)entry.getKey()), (class07709)entry.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + var1);
   }

   public class07709 createList(Stream<class07709> var1) {
      return new class07741(var1.collect(class07536.y()));
   }

   public class07709 emptyList() {
      return new class07741();
   }

   public DataResult<String> getStringValue(class07709 var1) {
      if (var1 instanceof class07707 class07707x) {
         class07707 class07707x = class07707x;

         try {
            s = class07707x.U();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         return DataResult.success(s);
      } else {
         return DataResult.error(() -> "Not a string");
      }
   }

   public class07709 createShort(short var1) {
      return class07730.N(var1);
   }

   public DataResult<Number> getNumberValue(class07709 var1) {
      return var1.P().<DataResult<Number>>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Not a number"));
   }

   public class07709 empty() {
      return class06997.y;
   }

   public <U> U convertTo(DynamicOps<U> var1, class07709 var2) {
      return (U)(switch (var2) {
         case class06997 class06997 -> (Object)var1.empty();
         case class07037 class07037 -> {
            byte b1;
            try {
               b1 = class07037.m();
            } catch (Throwable throwable6) {
               throw new MatchException(throwable6.toString(), throwable6);
            }

            byte b0 = b1;
            yield var1.createByte(b0);
         }
         case class07730 class07730x -> {
            class07730 class07730 = class07730x;

            try {
               short2 = class07730.m();
            } catch (Throwable throwable5) {
               throw new MatchException(throwable5.toString(), throwable5);
            }

            short short1 = short2;
            yield var1.createShort(short1);
         }
         case class07720 class07720x -> {
            class07720 class07720 = class07720x;

            try {
               l = class07720.m();
            } catch (Throwable throwable4) {
               throw new MatchException(throwable4.toString(), throwable4);
            }

            int i = l;
            yield var1.createInt(i);
         }
         case class07729 class07729x -> {
            class07729 class07729 = class07729x;

            try {
               k = class07729.m();
            } catch (Throwable throwable3) {
               throw new MatchException(throwable3.toString(), throwable3);
            }

            long j = k;
            yield var1.createLong(j);
         }
         case class07009 class07009 -> {
            class07009 class07009x = class07009;

            try {
               f1 = class07009x.m();
            } catch (Throwable throwable2) {
               throw new MatchException(throwable2.toString(), throwable2);
            }

            float f = f1;
            yield var1.createFloat(f);
         }
         case class07019 class07019 -> {
            class07019 class07019x = class07019;

            try {
               d1 = class07019x.m();
            } catch (Throwable throwable1) {
               throw new MatchException(throwable1.toString(), throwable1);
            }

            double d0 = d1;
            yield var1.createDouble(d0);
         }
         case class07029 class07029 -> (Object)var1.createByteList(ByteBuffer.wrap(class07029.i()));
         case class07707 class07707 -> {
            String s1;
            try {
               s1 = class07707.U();
            } catch (Throwable throwable) {
               throw new MatchException(throwable.toString(), throwable);
            }

            String s = s1;
            yield var1.createString(s);
         }
         case class07741 class07741 -> (Object)this.convertList(var1, class07741);
         case class07001 class07001 -> (Object)this.convertMap(var1, class07001);
         case class06995 class06995 -> (Object)var1.createIntList(Arrays.stream(class06995.M()));
         case class07757 class07757 -> (Object)var1.createLongList(Arrays.stream(class07757.M()));
         default -> throw new MatchException(null, null);
      });
   }

   public class07709 createByteList(ByteBuffer var1) {
      ByteBuffer bytebuffer = var1.duplicate().clear();
      byte[] abyte = new byte[var1.capacity()];
      bytebuffer.get(0, abyte, 0, abyte.length);
      return new class07029(abyte);
   }

   public class07709 createNumeric(Number var1) {
      return class07019.N(var1.doubleValue());
   }

   public class07709 createString(String var1) {
      return class07707.N(var1);
   }

   public class07709 createMap(Stream<Pair<class07709, class07709>> var1) {
      class07001 class07001 = new class07001();
      var1.forEach(var1x -> {
         class07709 class07709x = (class07709)var1x.getFirst();
         class07709 class07709x = (class07709)var1x.getSecond();
         if (class07709x instanceof class07707 class07707x) {
            class07707 class07707x = class07707x;

            try {
               s1 = class07707x.U();
            } catch (Throwable throwable) {
               throw new MatchException(throwable.toString(), throwable);
            }

            String s = s1;
            class07001.N(s, class07709x);
         } else {
            throw new UnsupportedOperationException("Cannot create map with non-string key: " + class07709x);
         }
      });
      return class07001;
   }

   public class07709 createByte(byte var1) {
      return class07037.N(var1);
   }

   public class07709 remove(class07709 var1, String var2) {
      if (var1 instanceof class07001) {
         class07001 class07001 = ((class07001)var1).U();
         class07001.b(var2);
         return class07001;
      } else {
         return var1;
      }
   }

   public class07709 createBoolean(boolean var1) {
      return class07037.N(var1);
   }

   public class07709 createLongList(LongStream var1) {
      return new class07757(var1.toArray());
   }

   public class07709 createDouble(double var1) {
      return class07019.N(var1);
   }

   public class07709 createIntList(IntStream var1) {
      return new class06995(var1.toArray());
   }

   public DataResult<class07709> mergeToMap(class07709 var1, MapLike<class07709> var2) {
      if (!(var1 instanceof class07001) && !(var1 instanceof class06997)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + var1, var1);
      } else {
         Iterator iterator = var2.entries().iterator();
         if (!iterator.hasNext()) {
            return var1 == this.empty() ? DataResult.success(this.emptyMap()) : DataResult.success(var1);
         } else {
            class07001 class07001x = var1 instanceof class07001 class07001x ? class07001x.U() : new class07001();
            ArrayList arraylist = new ArrayList();
            iterator.forEachRemaining(var2x -> {
               class07709 class07709 = (class07709)var2x.getFirst();
               if (class07709 instanceof class07707 class07707x) {
                  class07707 class07707x = class07707x;

                  try {
                     s1 = class07707x.U();
                  } catch (Throwable throwable) {
                     throw new MatchException(throwable.toString(), throwable);
                  }

                  String s = s1;
                  class07001x.N(s, (class07709)var2x.getSecond());
               } else {
                  arraylist.add(class07709);
               }
            });
            return !arraylist.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + arraylist, class07001x) : DataResult.success(class07001x);
         }
      }
   }

   public DataResult<class07709> mergeToList(class07709 var1, class07709 var2) {
      return U(var1)
         .map(var1x -> DataResult.success(var1x.N(var2).N()))
         .orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + var1, var1));
   }

   public DataResult<class07709> mergeToList(class07709 var1, List<class07709> var2) {
      return U(var1)
         .map(var1x -> DataResult.success(var1x.N(var2).N()))
         .orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + var1, var1));
   }

   public class07709 createInt(int var1) {
      return class07720.N(var1);
   }

   public DataResult<class07709> mergeToMap(class07709 var1, class07709 var2, class07709 var3) {
      if (!(var1 instanceof class07001) && !(var1 instanceof class06997)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + var1, var1);
      } else if (var2 instanceof class07707 class07707x) {
         class07707 class07707x = class07707x;

         try {
            s1 = class07707x.U();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         String s = s1;
         class07001 class07001x = var1 instanceof class07001 class07001x ? class07001x.U() : new class07001();
         class07001x.N(s, var3);
         return DataResult.success(class07001x);
      } else {
         return DataResult.error(() -> "key is not a string: " + var2, var1);
      }
   }

   public DataResult<class07709> mergeToMap(class07709 var1, Map<class07709, class07709> var2) {
      if (!(var1 instanceof class07001) && !(var1 instanceof class06997)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + var1, var1);
      } else if (var2.isEmpty()) {
         return var1 == this.empty() ? DataResult.success(this.emptyMap()) : DataResult.success(var1);
      } else {
         class07001 class07001x = var1 instanceof class07001 class07001x ? class07001x.U() : new class07001();
         ArrayList arraylist = new ArrayList();

         for (Entry entry : var2.entrySet()) {
            class07709 class07709 = (class07709)entry.getKey();
            if (class07709 instanceof class07707 class07707) {
               String s1;
               try {
                  s1 = class07707.U();
               } catch (Throwable throwable) {
                  throw new MatchException(throwable.toString(), throwable);
               }

               String s = s1;
               class07001x.N(s, (class07709)entry.getValue());
            } else {
               arraylist.add(class07709);
            }
         }

         return !arraylist.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + arraylist, class07001x) : DataResult.success(class07001x);
      }
   }

   public class07709 createFloat(float var1) {
      return class07009.N(var1);
   }

   public class07709 createLong(long var1) {
      return class07729.N(var1);
   }

   public DataResult<Stream<class07709>> getStream(class07709 var1) {
      return var1 instanceof class07023 ? DataResult.success(((class07023)var1).stream()) : DataResult.error(() -> "Not a list");
   }

   public RecordBuilder<class07709> mapBuilder() {
      return new class07736(this);
   }
}
