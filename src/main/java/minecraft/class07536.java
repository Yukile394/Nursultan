package minecraft;

import Nursultan.class10765;
import com.google.common.base.Ticker;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.MoreExecutors;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectLists;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceImmutableList;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07536 {
   public static final Logger N = LogUtils.getLogger();
   private static final int B = 255;
   private static final int Z = 10;
   private static final String z = "max.bg.threads";
   private static final class08717 U = L("Main");
   private static final class08717 E = N("IO-Worker-", false);
   private static final class08717 W = N("Download-", true);
   private static final DateTimeFormatter m = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH.mm.ss", Locale.ROOT);
   public static final int y = 8;
   private static final Set<String> P = Set.of("http", "https");
   public static final long L = 1000000L;
   public static class03393 u = System::nanoTime;
   public static final Ticker i = new class07543();
   public static final UUID R = new UUID(0L, 0L);
   public static final FileSystemProvider M = FileSystemProvider.installedProviders()
      .stream()
      .filter(var0 -> var0.getScheme().equalsIgnoreCase("jar"))
      .findFirst()
      .orElseThrow(() -> new IllegalStateException("No jar file system provider found"));
   private static Consumer<String> s = var0 -> {};

   public static <T> void L(List<T> var0, class06069 var1) {
      for (int ix = var0.size(); ix > 1; ix--) {
         int j = var1.y(ix);
         var0.set(ix - 1, var0.set(j, var0.get(ix - 1)));
      }
   }

   public static long L() {
      return u() / 1000000L;
   }

   public static <V> CompletableFuture<List<V>> L(List<? extends CompletableFuture<V>> var0) {
      if (var0.isEmpty()) {
         return CompletableFuture.completedFuture(List.of());
      } else {
         return var0.size() == 1
            ? ((CompletableFuture)var0.getFirst()).thenApply(ObjectLists::singleton)
            : CompletableFuture.allOf(var0.toArray(new CompletableFuture[0])).thenApply(var1 -> var0.stream().map(CompletableFuture::join).toList());
      }
   }

   public static String L(Throwable var0) {
      if (var0.getCause() != null) {
         return L(var0.getCause());
      } else {
         return var0.getMessage() != null ? var0.getMessage() : var0.toString();
      }
   }

   private static class08717 L(String var0) {
      int ix = M();
      Object object;
      if (ix <= 0) {
         object = MoreExecutors.newDirectExecutorService();
      } else {
         AtomicInteger atomicinteger = new AtomicInteger(1);
         object = new ForkJoinPool(ix, var2x -> {
            String sx = "Worker-" + var0 + "-" + atomicinteger.getAndIncrement();
            class07524 class07524 = new class07524(var2x, sx, var0);
            class07524.setName(sx);
            return class07524;
         }, class07536::N, true);
      }

      return new class08717((ExecutorService)object);
   }

   private static BooleanSupplier L(Path var0) {
      return new class07551(var0);
   }

   public static <T> CompletableFuture<T> L(Function<Executor, CompletableFuture<T>> var0) {
      return N_78(var0, CompletableFuture::isDone);
   }

   public static int M() {
      return class04995.N(Runtime.getRuntime().availableProcessors() - 1, 1, T());
   }

   public static <T> ToIntFunction<T> M(List<T> var0) {
      int ix = var0.size();
      if (ix < 8) {
         ReferenceImmutableList referenceimmutablelist = new ReferenceImmutableList(var0);
         return referenceimmutablelist::indexOf;
      } else {
         Reference2IntOpenHashMap reference2intopenhashmap = new Reference2IntOpenHashMap(ix);
         reference2intopenhashmap.defaultReturnValue(-1);

         for (int j = 0; j < ix; j++) {
            reference2intopenhashmap.put(var0.get(j), j);
         }

         return reference2intopenhashmap;
      }
   }

   public static boolean P() {
      return System.getProperty("os.arch").toLowerCase(Locale.ROOT).equals("aarch64");
   }

   private static int T() {
      String sx = System.getProperty("max.bg.threads");
      if (sx != null) {
         try {
            int ix = Integer.parseInt(sx);
            if (ix >= 1 && ix <= 255) {
               return ix;
            }

            N.error("Wrong {} property value '{}'. Should be an integer value between 1 and {}.", new Object[]{"max.bg.threads", sx, 255});
         } catch (NumberFormatException numberformatexception) {
            N.error("Could not parse {} property value '{}'. Should be an integer value between 1 and {}.", new Object[]{"max.bg.threads", sx, 255});
         }
      }

      return 255;
   }

   public class07536() {
      super();
   }

   public static class08717 B() {
      return U;
   }

   public static class08717 Z() {
      return E;
   }

   public static long i() {
      return Instant.now().toEpochMilli();
   }

   public static <V> CompletableFuture<List<V>> i(List<? extends CompletableFuture<? extends V>> var0) {
      CompletableFuture completablefuture = new CompletableFuture();
      return N_76(var0, var2 -> {
         if (completablefuture.completeExceptionally(var2)) {
            Iterator iterator = var0.iterator();

            while (iterator.hasNext()) {
               ((CompletableFuture)iterator.next()).cancel(true);
            }
         }
      }).applyToEither(completablefuture, Function.identity());
   }

   public static void s() {
      class10765 class10765 = new class10765("Timer hack thread");
      class10765.setDaemon(true);
      class10765.setUncaughtExceptionHandler(new class07980(N));
      class10765.start();
   }

   public static class07533 m() {
      String sx = System.getProperty("os.name").toLowerCase(Locale.ROOT);
      if (sx.contains("win")) {
         return class07533.field_1133;
      } else if (sx.contains("mac")) {
         return class07533.field_1137;
      } else if (sx.contains("solaris")) {
         return class07533.field_1134;
      } else if (sx.contains("sunos")) {
         return class07533.field_1134;
      } else if (sx.contains("linux")) {
         return class07533.field_1135;
      } else {
         return sx.contains("unix") ? class07533.field_1135 : class07533.field_1132;
      }
   }

   public static void U() {
      U.N(3L, TimeUnit.SECONDS);
      E.N(3L, TimeUnit.SECONDS);
   }

   public static class08717 z() {
      return W;
   }

   private static void u(String var0) {
      Instant instant = Instant.now();
      N.warn("Did you remember to set a breakpoint here?");
      if (Duration.between(instant, Instant.now()).toMillis() <= 500L) {
         s.accept(var0);
      }
   }

   public static long u() {
      return u.getAsLong();
   }

   public static <V> CompletableFuture<List<V>> u(List<? extends CompletableFuture<? extends V>> var0) {
      CompletableFuture completablefuture = new CompletableFuture();
      return N_76(var0, completablefuture::completeExceptionally).applyToEither(completablefuture, Function.identity());
   }

   public static <T> Optional<T> y_9(List<T> var0, class06069 var1) {
      return var0.isEmpty() ? Optional.empty() : Optional.of(N_77(var0, var1));
   }

   public static <T, R> Function<T, R> y_4(Function<T, R> var0) {
      return new class07555<>(var0);
   }

   public static <T> List<T> y(T[] var0, class06069 var1) {
      ObjectArrayList objectarraylist = new ObjectArrayList(var0);
      L(objectarraylist, var1);
      return objectarraylist;
   }

   public static <T> T y(Iterable<T> var0, @Nullable T var1) {
      Iterator iterator = var0.iterator();
      Object object = null;

      while (iterator.hasNext()) {
         Object object1 = iterator.next();
         if (object1 == var1) {
            if (object == null) {
               object = iterator.hasNext() ? Iterators.getLast(iterator) : var1;
            }
            break;
         }

         object = object1;
      }

      return (T)object;
   }

   public static void y(Path var0, Path var1, Path var2) throws IOException {
      Path path = var0.relativize(var2);
      Path path1 = var1.resolve(path);
      Files.copy(var2, path1);
   }

   public static void y(String var0) {
      N.error(var0);
      if (class07529.ND) {
         u(var0);
      }
   }

   public static <T extends Throwable> T y(T var0) {
      if (class07529.ND) {
         N.error("Trying to throw a fatal exception, pausing in IDE", var0);
         u(var0.getMessage());
      }

      return (T)var0;
   }

   public static <T> Collector<T, ?, List<T>> y() {
      return Collectors.toCollection(Lists::newArrayList);
   }

   private static BooleanSupplier y(Path var0) {
      return new class07540(var0);
   }

   public static <T> Predicate<T> y(Predicate<? super T> var0, Predicate<? super T> var1) {
      return var2 -> var0.test(var2) || var1.test(var2);
   }

   public static <T> Predicate<T> y(Predicate<? super T> var0, Predicate<? super T> var1, Predicate<? super T> var2) {
      return var3 -> var0.test(var3) || var1.test(var3) || var2.test(var3);
   }

   @Nullable
   private static Type<?> y(TypeReference var0, String var1) {
      Type type = null;

      try {
         type = class04999.N().getSchema(DataFixUtils.makeKey(class07529.y().comp_4026().y())).getChoiceType(var0, var1);
      } catch (IllegalArgumentException illegalargumentexception) {
         N.error("No data fixer registered for {}", var1);
         if (class07529.ND) {
            throw illegalargumentexception;
         }
      }

      return type;
   }

   public static <T> Predicate<T> y(Predicate<? super T> var0, Predicate<? super T> var1, Predicate<? super T> var2, Predicate<? super T> var3) {
      return var4 -> var0.test(var4) || var1.test(var4) || var2.test(var4) || var3.test(var4);
   }

   public static <T> Predicate<T> y_10(Predicate<? super T> var0) {
      return var0;
   }

   @SafeVarargs
   public static <T> Predicate<T> y(Predicate<? super T>... var0) {
      return var1 -> {
         Predicate[] apredicate = var0;
         int ix = var0.length;

         for (int j = 0; j < ix; j++) {
            if (apredicate[j].test(var1)) {
               return true;
            }
         }

         return false;
      };
   }

   public static <T> Predicate<T> y(List<? extends Predicate<? super T>> var0) {
      return switch (var0.size()) {
         case 0 -> W();
         case 1 -> y_10((Predicate<? super T>)var0.get(0));
         case 2 -> y((Predicate<? super T>)var0.get(0), (Predicate<? super T>)var0.get(1));
         case 3 -> y((Predicate<? super T>)var0.get(0), (Predicate<? super T>)var0.get(1), (Predicate<? super T>)var0.get(2));
         case 4 -> y((Predicate<? super T>)var0.get(0), (Predicate<? super T>)var0.get(1), (Predicate<? super T>)var0.get(2), (Predicate<? super T>)var0.get(3));
         case 5 -> y(
            (Predicate<? super T>)var0.get(0),
            (Predicate<? super T>)var0.get(1),
            (Predicate<? super T>)var0.get(2),
            (Predicate<? super T>)var0.get(3),
            (Predicate<? super T>)var0.get(4)
         );
         default -> y(var0.toArray(Predicate[]::new));
      };
   }

   public static <T> Predicate<T> y(
      Predicate<? super T> var0, Predicate<? super T> var1, Predicate<? super T> var2, Predicate<? super T> var3, Predicate<? super T> var4
   ) {
      return var5 -> var0.test(var5) || var1.test(var5) || var2.test(var5) || var3.test(var5) || var4.test(var5);
   }

   public static <T> Predicate<T> E() {
      return var0 -> true;
   }

   public static <A, B> Typed<B> N(Typed<A> var0, Type<B> var1, UnaryOperator<Dynamic<?>> var2) {
      Dynamic dynamic = (Dynamic)var0.write().getOrThrow();
      return N(var1, var2.apply(dynamic), true);
   }

   public static <T> Typed<T> N(Type<T> var0, Dynamic<?> var1) {
      return N(var0, var1, false);
   }

   public static <T> Typed<T> N(Type<T> var0, Dynamic<?> var1, boolean var2) {
      DataResult dataresult = var0.readTyped(var1).map(Pair::getFirst);

      try {
         return var2 ? (Typed)dataresult.getPartialOrThrow(IllegalStateException::new) : (Typed)dataresult.getOrThrow(IllegalStateException::new);
      } catch (IllegalStateException illegalstateexception) {
         class07080 class07080 = class07080.N(illegalstateexception, "Reading type");
         class07074 class07074 = class07080.N("Info");
         class07074.N("Data", var1);
         class07074.N("Type", var0);
         throw new class07878(class07080);
      }
   }

   public static IntArrayList N(IntStream var0, class06069 var1) {
      IntArrayList intarraylist = IntArrayList.wrap(var0.toArray());

      for (int ix = intarraylist.size(); ix > 1; ix--) {
         int j = var1.y(ix);
         intarraylist.set(ix - 1, intarraylist.set(j, intarraylist.getInt(ix - 1)));
      }

      return intarraylist;
   }

   public static <T> List<T> N(Stream<T> var0, class06069 var1) {
      ObjectArrayList objectarraylist = var0.collect(ObjectArrayList.toList());
      L(objectarraylist, var1);
      return objectarraylist;
   }

   public static int N(int[] var0, class06069 var1) {
      return var0[var1.y(var0.length)];
   }

   public static <T, U, R> BiFunction<T, U, R> N(BiFunction<T, U, R> var0) {
      return new class07561<>(var0);
   }

   public static <T> T N_78(Function<Executor, T> var0, Predicate<T> var1) {
      LinkedBlockingQueue linkedblockingqueue = new LinkedBlockingQueue();
      Object object = var0.apply(linkedblockingqueue::add);

      while (!var1.test(object)) {
         try {
            Runnable runnable = (Runnable)linkedblockingqueue.poll(100L, TimeUnit.MILLISECONDS);
            if (runnable != null) {
               runnable.run();
            }
         } catch (InterruptedException interruptedexception) {
            N.warn("Interrupted wait");
            break;
         }
      }

      int ix = linkedblockingqueue.size();
      if (ix > 0) {
         N.warn("Tasks left in queue: {}", ix);
      }

      return (T)object;
   }

   public static <T extends Comparable<T>> String N(class08092<T> var0, Object var1) {
      return var0.y((T)var1);
   }

   public static String N(String var0, @Nullable class01894 var1) {
      return var1 == null ? var0 + ".unregistered_sadface" : var0 + "." + var1.y() + "." + var1.N().replace('/', '.');
   }

   public static <T> List<T> N(ObjectArrayList<T> var0, class06069 var1) {
      ObjectArrayList objectarraylist = new ObjectArrayList(var0);
      L(objectarraylist, var1);
      return objectarraylist;
   }

   public static <K, V> Map<K, V> N(Map<K, V> var0, K var1, V var2) {
      return ImmutableMap.builderWithExpectedSize(var0.size() + 1).putAll(var0).put(var1, var2).buildKeepingLast();
   }

   public static <T> List<T> N(T var0, List<T> var1) {
      return ImmutableList.builderWithExpectedSize(var1.size() + 1).add(var0).addAll(var1).build();
   }

   public static <T> List<T> N(List<T> var0, T var1) {
      return ImmutableList.builderWithExpectedSize(var0.size() + 1).addAll(var0).add(var1).build();
   }

   public static <K, V> Collector<Entry<? extends K, ? extends V>, ?, Map<K, V>> N() {
      return Collectors.toMap(Entry::getKey, Entry::getValue);
   }

   public static URI N(String var0) throws URISyntaxException {
      URI uri = new URI(var0);
      String sx = uri.getScheme();
      if (sx == null) {
         throw new URISyntaxException(var0, "Missing protocol in URI: " + var0);
      } else {
         String s1 = sx.toLowerCase(Locale.ROOT);
         if (!P.contains(s1)) {
            throw new URISyntaxException(var0, "Unsupported protocol in URI: " + var0);
         } else {
            return uri;
         }
      }
   }

   public static DateTimeFormatter N(FormatStyle var0) {
      return DateTimeFormatter.ofLocalizedDateTime(var0);
   }

   public static int N(int var0, int var1) {
      return (int)Math.max(Math.min((long)var0 + (var0 >> 1), 2147483639L), (long)var1);
   }

   public static <T> boolean N(int var0, int var1, List<T> var2) {
      if (var0 == 1) {
         return true;
      } else {
         int ix = var0 / 2;

         for (int j = 0; j < var1; j++) {
            for (int k = 0; k < ix; k++) {
               int l = var0 - 1 - k;
               Object object = var2.get(k + j * var0);
               Object object1 = var2.get(l + j * var0);
               if (!object.equals(object1)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public static <T> Predicate<T> N(List<? extends Predicate<? super T>> var0) {
      return switch (var0.size()) {
         case 0 -> E();
         case 1 -> N_79((Predicate<? super T>)var0.get(0));
         case 2 -> N((Predicate<? super T>)var0.get(0), (Predicate<? super T>)var0.get(1));
         case 3 -> N((Predicate<? super T>)var0.get(0), (Predicate<? super T>)var0.get(1), (Predicate<? super T>)var0.get(2));
         case 4 -> N((Predicate<? super T>)var0.get(0), (Predicate<? super T>)var0.get(1), (Predicate<? super T>)var0.get(2), (Predicate<? super T>)var0.get(3));
         case 5 -> N(
            (Predicate<? super T>)var0.get(0),
            (Predicate<? super T>)var0.get(1),
            (Predicate<? super T>)var0.get(2),
            (Predicate<? super T>)var0.get(3),
            (Predicate<? super T>)var0.get(4)
         );
         default -> N(var0.toArray(var0x -> new Predicate[var0x]));
      };
   }

   @SafeVarargs
   public static <T> Predicate<T> N(Predicate<? super T>... var0) {
      return var1 -> {
         Predicate[] apredicate = var0;
         int ix = var0.length;

         for (int j = 0; j < ix; j++) {
            if (!apredicate[j].test(var1)) {
               return false;
            }
         }

         return true;
      };
   }

   public static <K, V1, V2> Map<K, V2> N(Map<K, V1> var0, com.google.common.base.Function<V1, V2> var1) {
      return Maps.transformValues(var0, var1);
   }

   public static <K, V1, V2> Map<K, V2> N(Map<K, V1> var0, Function<? super V1, V2> var1) {
      return var0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, var1x -> (V2)var1.apply(var1x.getValue())));
   }

   public static <K extends Enum<K>, V> Map<K, V> N_74(Class<K> var0, Function<K, V> var1) {
      EnumMap enummap = new EnumMap(var0);

      for (Enum oenum : (Enum[])var0.getEnumConstants()) {
         enummap.put((K)oenum, var1.apply(oenum));
      }

      return enummap;
   }

   public static <T> T N(T var0, Consumer<? super T> var1) {
      var1.accept(var0);
      return (T)var0;
   }

   public static <T> T N(Supplier<T> var0) {
      return (T)var0.get();
   }

   public static <T> T N(Iterable<T> var0, @Nullable T var1) {
      Iterator iterator = var0.iterator();
      Object object = iterator.next();
      if (var1 != null) {
         Object object1 = object;

         while (object1 != var1) {
            if (iterator.hasNext()) {
               object1 = iterator.next();
            }
         }

         if (iterator.hasNext()) {
            return (T)iterator.next();
         }
      }

      return (T)object;
   }

   public static <T> String N(class00751<T> var0, T var1) {
      class01894 class01894 = var0.y(var1);
      return class01894 == null ? "[unregistered]" : class01894.toString();
   }

   public static void N(Runnable var0, String var1) {
      if (class07529.ND) {
         Thread thread = Thread.currentThread();
         String sx = thread.getName();
         thread.setName(var1);

         try {
            Zone zone = TracyClient.beginZone(var1, class07529.ND);

            try {
               var0.run();
            } catch (Throwable throwable3) {
               if (zone != null) {
                  try {
                     zone.close();
                  } catch (Throwable throwable1) {
                     throwable3.addSuppressed(throwable1);
                  }
               }

               throw throwable3;
            }

            if (zone != null) {
               zone.close();
            }
         } finally {
            thread.setName(sx);
         }
      } else {
         Zone zone1 = TracyClient.beginZone(var1, class07529.ND);

         try {
            var0.run();
         } catch (Throwable throwable2) {
            if (zone1 != null) {
               try {
                  zone1.close();
               } catch (Throwable throwable) {
                  throwable2.addSuppressed(throwable);
               }
            }

            throw throwable2;
         }

         if (zone1 != null) {
            zone1.close();
         }
      }
   }

   @Nullable
   public static Type<?> N(TypeReference var0, String var1) {
      return !class07529.Nx ? null : y(var0, var1);
   }

   private static void N(Thread var0, Throwable var1) {
      y(var1);
      if (var1 instanceof CompletionException) {
         var1 = var1.getCause();
      }

      if (var1 instanceof class07878) {
         class03914.N(((class07878)var1).N().N(class02587.N));
         System.exit(-1);
      }

      N.error("Caught exception in thread {}", var0, var1);
   }

   public static void N(Throwable var0) {
      throw var0 instanceof RuntimeException ? (RuntimeException)var0 : new RuntimeException(var0);
   }

   private static class08717 N(String var0, boolean var1) {
      AtomicInteger atomicinteger = new AtomicInteger(1);
      return new class08717(Executors.newCachedThreadPool(var3 -> {
         Thread thread = new Thread(var3);
         String sx = var0 + atomicinteger.getAndIncrement();
         TracyClient.setThreadName(sx, var0.hashCode());
         thread.setName(sx);
         thread.setDaemon(var1);
         thread.setUncaughtExceptionHandler(class07536::N);
         return thread;
      }));
   }

   public static <T> Predicate<T> N(
      Predicate<? super T> var0, Predicate<? super T> var1, Predicate<? super T> var2, Predicate<? super T> var3, Predicate<? super T> var4
   ) {
      return var5 -> var0.test(var5) && var1.test(var5) && var2.test(var5) && var3.test(var5) && var4.test(var5);
   }

   public static <T> Predicate<T> N(Predicate<? super T> var0, Predicate<? super T> var1, Predicate<? super T> var2, Predicate<? super T> var3) {
      return var4 -> var0.test(var4) && var1.test(var4) && var2.test(var4) && var3.test(var4);
   }

   public static <T> Predicate<T> N(Predicate<? super T> var0, Predicate<? super T> var1, Predicate<? super T> var2) {
      return var3 -> var0.test(var3) && var1.test(var3) && var2.test(var3);
   }

   public static <T> Predicate<T> N(Predicate<? super T> var0, Predicate<? super T> var1) {
      return var2 -> var0.test(var2) && var1.test(var2);
   }

   public static <T> Predicate<T> N_79(Predicate<? super T> var0) {
      return var0;
   }

   public static int N(String var0, int var1, int var2) {
      int ix = var0.length();
      if (var2 >= 0) {
         for (int j = 0; var1 < ix && j < var2; j++) {
            if (Character.isHighSurrogate(var0.charAt(var1++)) && var1 < ix && Character.isLowSurrogate(var0.charAt(var1))) {
               var1++;
            }
         }
      } else {
         for (int k = var2; var1 > 0 && k < 0; k++) {
            var1--;
            if (Character.isLowSurrogate(var0.charAt(var1)) && var1 > 0 && Character.isHighSurrogate(var0.charAt(var1 - 1))) {
               var1--;
            }
         }
      }

      return var1;
   }

   public static boolean N(Path var0, Path var1, Path var2, boolean var3) {
      if (Files.exists(var0) && !N(10, "create backup " + var2, N(var2), N(var0, var2), L(var2))) {
         return false;
      } else if (!N(10, "remove old " + var0, N(var0), y(var0))) {
         return false;
      } else if (!N(10, "replace " + var0 + " with " + var1, N(var1, var0), L(var0)) && !var3) {
         N(10, "restore " + var0 + " from " + var2, N(var2, var0), L(var0));
         return false;
      } else {
         return true;
      }
   }

   public static void N(Path var0, Path var1, Path var2) {
      N(var0, var1, var2, false);
   }

   private static boolean N(int var0, String var1, BooleanSupplier... var2) {
      for (int ix = 0; ix < var0; ix++) {
         if (N(var2)) {
            return true;
         }

         N.error("Failed to {}, retrying {}/{}", new Object[]{var1, ix, var0});
      }

      N.error("Failed to {}, aborting, progress might be lost", var1);
      return false;
   }

   private static boolean N(BooleanSupplier... var0) {
      for (BooleanSupplier booleansupplier : var0) {
         if (!booleansupplier.getAsBoolean()) {
            N.warn("Failed to execute {}", booleansupplier);
            return false;
         }
      }

      return true;
   }

   private static BooleanSupplier N(Path var0) {
      return new class07552(var0);
   }

   public static <K, V> class03682<K, V> N(Function<K, V> var0) {
      return new class03682<>(var0);
   }

   public static String N_75(String var0, class01036 var1) {
      return var0.toLowerCase(Locale.ROOT)
         .chars()
         .mapToObj(var1x -> var1.test((char)var1x) ? Character.toString((char)var1x) : "_")
         .collect(Collectors.joining());
   }

   public static <T> DataResult<List<T>> N(List<T> var0, int var1) {
      if (var0.size() != var1) {
         Supplier supplier = () -> "Input is not a list of " + var1 + " elements";
         return var0.size() >= var1 ? DataResult.error(supplier, var0.subList(0, var1)) : DataResult.error(supplier);
      } else {
         return DataResult.success(var0);
      }
   }

   public static DataResult<long[]> N(LongStream var0, int var1) {
      long[] along = var0.limit(var1 + 1).toArray();
      if (along.length != var1) {
         Supplier supplier = () -> "Input is not a list of " + var1 + " longs";
         return along.length >= var1 ? DataResult.error(supplier, Arrays.copyOf(along, var1)) : DataResult.error(supplier);
      } else {
         return DataResult.success(along);
      }
   }

   public static DataResult<int[]> N(IntStream var0, int var1) {
      int[] aint = var0.limit(var1 + 1).toArray();
      if (aint.length != var1) {
         Supplier supplier = () -> "Input is not a list of " + var1 + " ints";
         return aint.length >= var1 ? DataResult.error(supplier, Arrays.copyOf(aint, var1)) : DataResult.error(supplier);
      } else {
         return DataResult.success(aint);
      }
   }

   public static Consumer<String> N(String var0, Consumer<String> var1) {
      return var2 -> var1.accept(var0 + var2);
   }

   private static <V> CompletableFuture<List<V>> N_76(List<? extends CompletableFuture<? extends V>> var0, Consumer<Throwable> var1) {
      ObjectArrayList objectarraylist = new ObjectArrayList();
      objectarraylist.size(var0.size());
      CompletableFuture[] acompletablefuture = new CompletableFuture[var0.size()];

      for (int ix = 0; ix < var0.size(); ix++) {
         int j = ix;
         acompletablefuture[ix] = ((CompletableFuture)var0.get(ix)).whenComplete((var3x, var4x) -> {
            if (var4x != null) {
               var1.accept(var4x);
            } else {
               objectarraylist.set(j, var3x);
            }
         });
      }

      return CompletableFuture.allOf(acompletablefuture).thenApply(var1x -> objectarraylist);
   }

   public static void N(String var0, Throwable var1) {
      N.error(var0, var1);
      if (class07529.ND) {
         u(var0);
      }
   }

   public static Runnable N(Runnable var0, Supplier<String> var1) {
      if (class07529.c) {
         String sx = (String)var1.get();
         return new class07545(var0, sx);
      } else {
         return var0;
      }
   }

   public static <T> Supplier<T> N(Supplier<T> var0, Supplier<String> var1) {
      if (class07529.c) {
         String sx = (String)var1.get();
         return new class07553<>(var0, sx);
      } else {
         return var0;
      }
   }

   public static <T> Optional<T> N(Optional<T> var0, Consumer<T> var1, Runnable var2) {
      if (var0.isPresent()) {
         var1.accept(var0.get());
      } else {
         var2.run();
      }

      return var0;
   }

   private static BooleanSupplier N(Path var0, Path var1) {
      return new class07563(var0, var1);
   }

   public static <T> T N_77(List<T> var0, class06069 var1) {
      return (T)var0.get(var1.y(var0.size()));
   }

   public static <T> T N(T[] var0, class06069 var1) {
      return (T)var0[var1.y(var0.length)];
   }

   public static void N(Consumer<String> var0) {
      s = var0;
   }

   public static <T> Predicate<T> W() {
      return var0 -> false;
   }

   public static String R() {
      return m.format(ZonedDateTime.now());
   }

   public static <T> ToIntFunction<T> R(List<T> var0) {
      int ix = var0.size();
      if (ix < 8) {
         return var0::indexOf;
      } else {
         Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap(ix);
         object2intopenhashmap.defaultReturnValue(-1);

         for (int j = 0; j < ix; j++) {
            object2intopenhashmap.put(var0.get(j), j);
         }

         return object2intopenhashmap;
      }
   }
}
