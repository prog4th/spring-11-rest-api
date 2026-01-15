package kr.ac.kumoh.s20260000.spring11restapi.repository

import kr.ac.kumoh.s20260000.spring11restapi.model.Song
import org.springframework.data.mongodb.repository.MongoRepository

interface SongRepository : MongoRepository<Song, String> {
}