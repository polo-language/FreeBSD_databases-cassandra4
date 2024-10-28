--- src/java/org/apache/cassandra/service/NativeTransportService.java.orig	2024-10-28 19:13:22.155897000 +0800
+++ src/java/org/apache/cassandra/service/NativeTransportService.java	2024-10-28 19:16:58.268428000 +0800
@@ -167,12 +167,15 @@
      */
     public static boolean useEpoll()
     {
+        /*
         final boolean enableEpoll = NATIVE_EPOLL_ENABLED.getBoolean();
 
         if (enableEpoll && !Epoll.isAvailable() && NativeLibrary.osType == NativeLibrary.OSType.LINUX)
             logger.warn("epoll not available", Epoll.unavailabilityCause());
 
         return enableEpoll && Epoll.isAvailable();
+        */
+        return false; // Epoll is only available for Linux. Prevent warning given that we otherwise pass ourselves off as Linux.
     }
 
     /**
