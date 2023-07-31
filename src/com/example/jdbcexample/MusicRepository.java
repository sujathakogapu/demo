package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MusicRepository {
	public void printSongsTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("music_library");

		Statement statement = null;
		ResultSet rs = null;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			rs = statement.executeQuery("select * from songs");
			// step5:process result set
			while (rs.next()) {
				int songId = rs.getInt("song_id");
				int albumId = rs.getInt("album_id");
				String songTitle = rs.getString("title");
				String songGenre = rs.getString("genre");
				int songDuration = rs.getInt("duration");
				System.out.println(String.format("songId=%s | albumId=%s | songTitle=%s | songGenre=%s | songDuration",
						songId, albumId, songTitle, songGenre, songDuration));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// step6:close the resources
			try {
				rs.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void insertSongTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("music_library");

		Statement statement = null;
		int count = 0;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the insert query
			count = statement
					.executeUpdate("insert into music_library.songs (album_id, title, duration, genre) values\r\n"
							+ "(2, 'Song Five', 250, 'Pop')");
			// step5:print the inserted count
			System.out.println(String.format("The Number Of Rows Inserted :%s", count));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// step6:close the resources
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void updateSongTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("music_library");

		Statement statement = null;
		int count = 0;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the insert query
			count = statement.executeUpdate("update music_library.songs set title='Debut Song' where song_id=9");
			// step5:print the inserted count
			System.out.println(String.format("The Number Of Rows Updated :%s", count));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// step6:close the resources
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void deleteSongTable() {
		// step1:establish the connection
		Connection connection = MySqlDbConnection.getConnection("music_library");

		Statement statement = null;
		int count = 0;
		try {
			// step2:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the insert query
			count = statement.executeUpdate("delete from music_library.songs where song_id=9");
			// step5:print the inserted count
			System.out.println(String.format("The Number Of Rows Deleted :%s", count));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// step6:close the resources
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		MusicRepository obj = new MusicRepository();
		obj.printSongsTable();
		// obj.insertSongTable();
		// obj.updateSongTable();
		// obj.deleteSongTable();
	}

}
