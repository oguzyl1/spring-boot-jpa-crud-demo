# spring-boot-jpa-crud-demo
Spring Boot ile JpaRepository kullanılarak CRUD işlemleri gerçekleştiren demo proje.

# Proje Özellikleri ve Kullanılan Sınıflar

## `dao` Paketi

### `EmployeeRepository`
Bu sınıf, veritabanı işlemleri için JpaRepository'yi genişleterek, `Employee` entity sınıfı için CRUD (Create, Read, Update, Delete) operasyonlarını sağlar.

## `service` Paketi

### `EmployeeService`
Bu sınıf, iş mantığı operasyonlarını yürütmek için `EmployeeRepository` ile etkileşimde bulunur. Veritabanı işlemleri için `EmployeeRepository`'yi kullanır ve gerekirse iş mantığı kurallarını uygular.

### `IEmloyeeService`
Bu arayüz, iş mantığı servisi olan `EmployeeService` sınıfının metodlarını belirler ve servis katmanındaki sınıfların bu arayüzü implemente etmelerini sağlar.

## `rest` Paketi

### `EmployeeController`
Bu sınıf, dış dünya ile iletişim kurmak üzere RESTful servisler sağlar. HTTP taleplerini yakalar, uygun `EmployeeService` metotlarına yönlendirir ve sonuçları istemcilere sunar.

## `entity` Paketi

### `Employee`
Bu sınıf, veritabanındaki "employees" tablosunu temsil eder. JPA tarafından yönetilen bir entity olarak, `EmployeeRepository` ve `EmployeeService` sınıfları ile etkileşimde bulunarak veritabanı işlemlerini gerçekleştirir.

### Proje Özellikleri

- Spring Boot ve Spring Data JPA kullanılarak oluşturulmuştur.
- Veritabanı işlemleri için JpaRepository kullanılmıştır.
- Temel CRUD operasyonları (ekleme, okuma, güncelleme, silme) uygulanmıştır.
- Model sınıfları, Repository sınıfları ve servis katmanı ile modüler bir yapıya sahiptir.

Bu proje, Spring Boot ve JpaRepository kullanarak temel CRUD operasyonlarını uygulamak isteyen geliştiriciler için bir başlangıç noktasıdır. Sınıflar arasındaki etkileşimleri anlamak ve projeyi geliştirmek için bu belgeyi kullanabilirsiniz.
