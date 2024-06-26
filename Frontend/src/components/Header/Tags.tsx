import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import { API_URL } from '../../config';

export const Tags = () => {
  const [tags, setTags] = useState<string[]>([]);

  useEffect(() => {
    fetch(`${API_URL}/app/article/tags/`, {
      method: "GET",
      headers: {
        'X-Requested-With': 'XMLHttpRequest',
      },
    })
      .then((res) => res.json())
      .then((tags: string[]) => setTags(tags))
      .catch((error) => console.error('Error:', error)
      );
  }, []);

  return (
    <div className="container">
      <br /><br />
      {tags.map((tag, index) => (
        <ul key={index}>
          <p className="tagLink"><Link to={`/tags/${tag}`}>{tag}</Link></p>
        </ul>
      ))}
    </div>
  );
};
