DROP TABLE episode;

CREATE TABLE episode
(
  episodeId serial NOT NULL,
  episodeKey character varying,
  title character varying,
  body character varying,
  timeadded timestamp without time zone default current_timestamp,
  CONSTRAINT episode_pkey PRIMARY KEY (episodeId)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE episode
  OWNER TO postgres;
