# learn-observer-pattern
**NB: Mohon memberitahu saya jika ada kekeliruan dalam kode, penjelasan, atau konsep. Thanks.**
* * *

**Observer pattern** merupakan salah satu **behavioral design pattern** yang cara kerjanya mirip dengan ketika kita melakukan subscribe `newsletter` di aplikasi-aplikasi yang kita sukai.

Kode ini menjelaskan **sedikit** tentang bagaimana `Observer` bekerja. 

Contoh dari kode ini adalah:

Terdapat object **Repo** yang dapat melakukan disubscribe oleh **SlackNotification** dan **TelegramNotification** dimana pada saat **Repo** menjalankan fungsi `pushRepo`, maka dengan bantuan **RepoNotificationManager** akan mengabari semua **subscriber** untuk menjalankan fungsi `update`.

