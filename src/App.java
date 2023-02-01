import java.util.Scanner;

import javax.management.ConstructorParameters;

import rentalmobil.ArraylistCostumer;
import rentalmobil.ArraylistKategori;
import rentalmobil.ArraylistRental;

public class App {

	private static Scanner scannerInt = new Scanner(System.in);
	private static Scanner scannerStr = new Scanner(System.in);

	public static void setInitialValue() {
		ArraylistKategori.addKategori("Avanza", "B 1234 ABC", "Merah", 2500000, false, "MPV",
				"Mobil yang nyaman untuk keluarga");
		ArraylistKategori.addKategori("Brio", "B 1234 ABC", "Merah", 2500000, false, "MPV",
				"Mobil yang nyaman untuk keluarga");
		ArraylistKategori.addKategori("Yaris", "B 1234 ABC", "Merah", 2500000, false, "MPV",
				"Mobil yang nyaman untuk keluarga");

		ArraylistCostumer.addCostumer("Rizky", "Jl. Raya", "123456789", "08123456789");
		ArraylistCostumer.addCostumer("Adam", "Jl. Raya", "123456789", "08123456789");
		ArraylistCostumer.addCostumer("Akbar", "Jl. Raya", "123456789", "08123456789");
		ArraylistCostumer.addCostumer("Bilar", "Jl. Raya", "123456789", "08123456789");

		ArraylistRental.addRental(3, 2, "22-02-2023", "25-02-2023", 5, 2500000);
		ArraylistRental.addRental(1, 1, "22-02-2023", "25-02-2023", 5, 2500000);
		ArraylistRental.addRental(2, 0, "22-02-2023", "25-02-2023", 5, 2500000);
		ArraylistRental.addRental(0, 2, "22-02-2023", "25-02-2023", 5, 2500000);
	}

	public static void main(String[] args) {
		setInitialValue();

		boolean exit = false;

		do {
			System.out.println("--- RENTAL MOBIL ---");
			System.out.println("1. List Mobil");
			System.out.println("2. List Customer");
			System.out.println("3. Rental Mobil");
			System.out.println("4. Exit");

			System.out.print("Pilih menu: ");
			int pilihan = scannerInt.nextInt();

			// newline
			System.out.println();

			switch (pilihan) {
				case 1: {
					// System.out.println("--- LIST MOBIL ---");
					// System.out.printf("No\tNo Plat\tNama\tWarna\tHarga\tStatus
					// Sewa\tKategori\tDeskripsi");
					// System.out.println();
					// System.out.println("--- LIST MOBIL ---");
					// System.out.printf("%-9s %-14s %-7s %12s %16s %17s %13s %28s", "No", "No
					// Plat", "Nama", "Warna",
					// "Harga", "Status Sewa", "Kategori", "Deskripsi");
					// System.out.println();
					// for (int i = 0; i < ArraylistKategori.getSize(); i++) {
					// System.out.println((i + 1) + "\t" + ArraylistKategori.getNoPlat(i) + "\t"
					// + ArraylistKategori.getNama(i) + "\t\t" + ArraylistKategori.getWarna(i) +
					// "\t\t"
					// + ArraylistKategori.getHarga(i) + "\t\t" + ArraylistKategori.getStatusSewa(i)
					// + "\t\t"
					// + ArraylistKategori.getKategori(i) + "\t\t" +
					// ArraylistKategori.getDeskripsi(i));
					// }

					
					ArraylistKategori.displayListMobil();

					// newline
					System.out.println();

					System.out.println("1. Tambah Mobil");
					System.out.println("2. Delete Mobil");
					System.out.println("3. Update status");
					System.out.println("4. Kembali");

					System.out.print("Masukan Pilihan Anda : ");
					int opsi = scannerInt.nextInt();

					// newline only if opsi is valid
					if (opsi >= 1 && opsi <= 3) {
						System.out.println();
					}

					switch (opsi) {

						case 1: {
							System.out.print("Nama Mobil : ");
							String nama = scannerStr.nextLine();

							System.out.print("No Plat : ");
							String noPlat = scannerStr.nextLine();

							System.out.print("Warna : ");
							String warna = scannerStr.nextLine();

							System.out.print("Harga Sewa/hari : ");
							int harga = scannerInt.nextInt();

							System.out.println("Kategori : ");
							String kategori = scannerStr.nextLine();

							System.out.println("Deskripsi : ");

							String deskripsi = scannerStr.nextLine();
							ArraylistKategori.addKategori(nama, noPlat, warna, harga, false, kategori, deskripsi);

							break;
						}
						case 2: {
							if (ArraylistKategori.getSize() == 0) {
								System.out.println("Data Kosong");
								return;
							}

							// System.out.println("No. Plat\tMerk\tWarna\tHarga Sewa/hari\tStatus");
							// for (int i = 0; i < ArraylistKategori.getSize(); i++) {
							// System.out.println((i + 1) + "\t" + ArraylistKategori.getNoPlat(i) + "\t"
							// + ArraylistKategori.getNama(i) + "\t" + ArraylistKategori.getWarna(i) + "\t"
							// + ArraylistKategori.getHarga(i) + "\t\t" + ArraylistKategori.getStatusSewa(i)
							// + "\t" + ArraylistKategori.getKategori(i) + "\t"
							// + ArraylistKategori.getDeskripsi(i));
							// }

						
							ArraylistKategori.displayListMobil();

							// int hapus = inputIntScanner.nextInt();

							System.out.print("Masukan Id Mobil : ");
							int id = scannerInt.nextInt();

							// check if the id is valid
							if (id < 1 || id > ArraylistKategori.getSize()) {
								System.out.println("Id tidak valid");
								break;
							}

							ArraylistKategori.removeKategori(id - 1);
							System.out.println("Data berhasil dihapus");
							break;
						}
						case 3: {
							// condision diatas
							if (ArraylistKategori.getSize() == 0) {
								System.out.println("Data Kosong");
								return;
							}

							// System.out.println("No. Plat\tMerk\tWarna\tHarga Sewa/hari\tStatus");
							// System.out.println("Id\tNo. Plat\tMerk\tWarna\tHarga Sewa/hari\tStatus");
							// for (int i = 0; i < ArraylistKategori.getSize(); i++) {
							// System.out.println((i + 1) + "\t" + ArraylistKategori.getNoPlat(i) + "\t"
							// + ArraylistKategori.getNama(i) + "\t" + ArraylistKategori.getWarna(i) + "\t"
							// + ArraylistKategori.getHarga(i) + "\t1\t" +
							// ArraylistKategori.getStatusSewa(i));
							// }

							ArraylistKategori.displayListMobil();

							System.out.println("Masukan Id Mobil : ");
							int id = scannerInt.nextInt();

							// check jika id sudah valid
							if (id < 1 || id > ArraylistKategori.getSize()) {
								System.out.println("Id tidak valid");
								break;
							}

							ArraylistKategori.updateStatus(id - 1, true);
							System.out.println("Status Berhasil Diubah");
							break;
						}
						case 4: {
							break;
						}
						// add default case
						default:
							System.out.println("Pilihan tidak ada");
							break;
					}
					break;
				}
				case 2: {
					// System.out.println("List Pelanggan");
					// System.out.println("Id\tNama\tAlamat\tNo KTP\tNo. Telp");
					// for (int i = 0; i < ArraylistCostumer.getSize(); i++) {
					// System.out.println((i + 1) + "\t" + ArraylistCostumer.getCostumer(i) + "\t"
					// + ArraylistCostumer.getAlamat(i) + "\t" + ArraylistCostumer.getNoKTP(i) +
					// "\t"
					// + ArraylistCostumer.getNoTelepon(i));
					// }

					ArraylistCostumer.displayCostumer();

					// newline
					System.out.println();

					System.out.println("1. Tambah Pelanggan");
					System.out.println("2. Delete Pelanggan");
					System.out.println("3. Kembali");

					System.out.print("Masukan Pilihan Anda : ");
					int opsi = scannerInt.nextInt();

					// newline jika opsi valid
					if (opsi >= 1 && opsi <= 2) {
						System.out.println();
					}

					switch (opsi) {
						case 1: {
							System.out.print("Nama Pelanggan : ");
							String nama = scannerStr.nextLine();

							System.out.print("Alamat : ");
							String alamat = scannerStr.nextLine();

							System.out.print("No. KTP : ");
							String noKtp = scannerStr.nextLine();

							System.out.print("No. Telp : ");
							String noTelp = scannerStr.nextLine();

							ArraylistCostumer.addCostumer(nama, alamat, noKtp, noTelp);
							break;
						}
						case 2: {
							if (ArraylistCostumer.getSize() == 0) {
								System.out.println("Data Kosong");
								return;
							}

							// System.out.println("Id\tNama\tAlamat\tNo. Telp");
							// for (int i = 0; i < ArraylistCostumer.getSize(); i++) {
							// System.out.println((i + 1) + "\t" + ArraylistCostumer.getCostumer(i) + "\t"
							// + ArraylistCostumer.getAlamat(i) + "\t" + ArraylistCostumer.getNoTelepon(i));
							// }

							ArraylistCostumer.displayCostumer();

							System.out.println("Masukan Id Pelanggan : ");
							int id = scannerInt.nextInt();

							// check jika id valid
							if (id < 1 || id > ArraylistCostumer.getSize()) {
								System.out.println("Id tidak valid");
								break;
							}

							ArraylistCostumer.deleteCostumer(id - 1);
							System.out.println("Data berhasil dihapus");
							break;
						}
						case 3:
							break;
						// add default case
						default:
							System.out.println("Pilihan tidak ada");
							break;
					}
					break;
				}
				case 3: {
					// System.out.println("List Sewa");
					// System.out.println("Id\tNama\tMobil\tTanggal Awal\tTanggal Akhir\tLama
					// Sewa\tTotal Harga");
					// for (int i = 0; i < ArraylistRental.getSize(); i++) {
					// System.out.println((i + 1) + "\t"
					// + ArraylistCostumer.getCostumer(ArraylistRental.getIdCostumer(i)) + "\t"
					// + ArraylistKategori.getNama(ArraylistRental.getIdMobil(i)) + "\t"
					// + ArraylistRental.getTanggalAwal(i) + "\t"
					// + ArraylistRental.getTanggalAkhir(i) + "\t" + ArraylistRental.getLamaSewa(i)
					// + "hari"
					// + "\t"
					// + ArraylistRental.getHarga(i));
					// }

					ArraylistRental.displayRentalCostumer();

					// newline
					System.out.println();

					System.out.println("1. Tambah Sewa");
					System.out.println("2. Delete Sewa");
					System.out.println("3. Kembali");

					System.out.print("Masukan Pilihan Anda : ");
					int opsi = scannerInt.nextInt();

					if (opsi >= 1 && opsi <= 2) {
						System.out.println();
					}

					switch (opsi) {
						case 1: {
							// System.out.println("List Pelanggan");
							// System.out.println("Id\tNama\tAlamat\tNo KTP\tNo. Telp");
							// for (int i = 0; i < ArraylistCostumer.getSize(); i++) {
							// System.out.println((i + 1) + "\t" + ArraylistCostumer.getCostumer(i) + "\t"
							// + ArraylistCostumer.getAlamat(i) + "\t" + ArraylistCostumer.getNoKTP(i) +
							// "\t"
							// + ArraylistCostumer.getNoTelepon(i));
							// }
							// ArraylistRental.displayRentalCostumer();

							ArraylistCostumer.displayCostumer();

							ArraylistKategori.displayListMobil();

							System.out.print("Masukan Id Pelanggan : ");
							int idCostumer = scannerInt.nextInt();
							if (idCostumer < 0 || idCostumer > ArraylistCostumer.getSize()) {
								System.out.println("costumer tidak ada");
								break;

							}

							System.out.print("Masukan Id Mobil : ");
							int idMobil = scannerInt.nextInt();
							if (idMobil < 0 || idMobil > ArraylistKategori.getSize()) {
								System.out.println("Mobil tidak ada");
								break;
							}

							// validate the id
							idMobil = idMobil - 1;

							System.out.print("Tanggal Awal : ");
							String tanggalAwal = scannerStr.nextLine();

							System.out.print("Tanggal Akhir : ");
							String tanggalAkhir = scannerStr.nextLine();

							System.out.print("Lama Sewa : ");
							int lamaSewa = scannerInt.nextInt();

							System.out.print("Total Harga : ");

							
							int harga = scannerInt.nextInt();

							ArraylistRental.addRental(idCostumer, idMobil, tanggalAwal, tanggalAkhir, lamaSewa, harga);
							break;
						}
						case 2: {
							if (ArraylistRental.getSize() == 0) {
								System.out.println("Tidak ada data");
								break;
							}

							// System.out.println("Id\tNama\tMobil\tTanggal Awal\tTanggal Akhir\tLama
							// Sewa\tTotal Harga");
							// for (int i = 0; i < ArraylistRental.getSize(); i++) {
							// System.out.println(ArraylistRental.getIdCostumer(i + 1) + "\t"
							// + ArraylistCostumer.getCostumer(i)
							// + ArraylistRental.getIdMobil(i) + "\t" + ArraylistRental.getTanggalAwal(i)
							// + "\t"
							// + ArraylistRental.getTanggalAkhir(i) + "\t" + ArraylistRental.getLamaSewa(i)
							// + "hari" + "\t"
							// + ArraylistRental.getHarga(i));
							// }
							ArraylistRental.displayRentalCostumer();
							System.out.print("Masukan Id penyewa yang ingin dihapus : ");
							int id = scannerInt.nextInt();
							// validate the id
							if (id < 0 || id >= ArraylistRental.getSize()) {
								System.out.println("Id tidak valid");
								break;
							}

							ArraylistRental.deleteRental(id - 1);
							System.out.println("Data berhasil dihapus");
							break;
						}
						case 3:
							break;
						// add default case
						default:
							System.out.println("Pilihan tidak valid");
					}
					break;
				}
				case 4:
					exit = true;
					break;
				default:
					System.out.println("Pilihan tidak valid");
			}

			// newline if not exit
			if (!exit)
				System.out.println();

		} while (!exit);
	}
}
